package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Udemy.Aula_29_JDBC.MiniProjeto.src.aplication.DBIntegrityException;
import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DB;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.db.DbException;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.SellerDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Department;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void deleteById(int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");

            preparedCommand.setInt(1, id);

            int rowsAffected = preparedCommand.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done! Seller deleted.");
            } else {
                System.out.println("Seller not found. Nothing was deleted.");
            }
        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedCommand);
        }

    }

    @Override
    public List<Seller> findAll() {
        List<Seller> listSellers = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        ResultSet result = null;

        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement(
                    "SELECT seller.*, department.Id AS DepId, department.Name AS DepName " +
                            "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id ORDER BY seller.fullName");

            result = preparedCommand.executeQuery();

            while (result.next()) {
                Department department = instantiateDepartment(result);
                Seller seller = instantiateSeller(result, department);
                listSellers.add(seller);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

        return listSellers;
    }

    @Override
    public Seller findById(int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        ResultSet result = null;
        Seller seller = null;

        try {
            connection = DB.getConnection();
            String sql = "SELECT seller.*, department.Id AS DepId, department.Name AS DepName " +
                    "FROM seller " +
                    "INNER JOIN department ON seller.DepartmentId = department.Id " +
                    "WHERE seller.Id = ?";

            preparedCommand = connection.prepareStatement(sql);
            preparedCommand.setInt(1, id);

            result = preparedCommand.executeQuery();

            if (result.next()) {
                Department department = instantiateDepartment(result);
                seller = instantiateSeller(result, department);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

        return seller;
    }

    @Override
    public void insert(Seller seller, int departmentId) {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement(
                    "INSERT INTO seller (fullName, email, birthDate, baseSalary, departmentId) VALUES (?, ?, ?, ?, ?)");

            preparedComand.setString(1, seller.getName());
            preparedComand.setString(2, seller.getEmail());
            preparedComand.setDate(3, java.sql.Date.valueOf(seller.getBirthDate()));
            preparedComand.setDouble(4, seller.getBaseSalary());

            PreparedStatement checkDeptStmt = connection.prepareStatement("SELECT id FROM department WHERE id = ?");
            checkDeptStmt.setInt(1, departmentId);
            ResultSet deptResult = checkDeptStmt.executeQuery();
            if (!deptResult.next()) {
                System.out.println("Departament with id " + departmentId + " not found.");
            }
            deptResult.close();
            checkDeptStmt.close();

            preparedComand.setInt(5, departmentId);

            int rowsAffected = preparedComand.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Done! seller inserted!");

            } else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedComand);
        }

    }

    @Override
    public void update(Seller seller, int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;

        try {
            connection = DB.getConnection();

            preparedCommand = connection.prepareStatement(
                    "UPDATE seller SET fullName = ?, email = ?, birthDate = ?, baseSalary = ? WHERE id = ?");

            preparedCommand.setString(1, seller.getName());
            preparedCommand.setString(2, seller.getEmail());
            preparedCommand.setDate(3, java.sql.Date.valueOf(seller.getBirthDate()));
            preparedCommand.setDouble(4, seller.getBaseSalary());
            preparedCommand.setInt(5, id);

            int rowsAffected = preparedCommand.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Done! Seller updated!");
            } else {
                System.out.println("Seller not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedCommand);
        }
    }

    public static int getMaxId() {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        ResultSet result = null;
        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement("SELECT MAX(id) AS max_id FROM seller");
            result = preparedCommand.executeQuery();

            if (result.next()) {
                int lastId = result.getInt("max_id");
                return (lastId == 0) ? 1 : lastId + 1;
            } else {
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

    }

    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
        int id = rs.getInt("Id");
        String name = rs.getString("FullName");
        String email = rs.getString("Email");
        LocalDate birthDate = rs.getDate("BirthDate").toLocalDate();
        double baseSalary = rs.getDouble("BaseSalary");

        Seller seller = new Seller(name, email, birthDate, baseSalary, dep);
        seller.setId(id);
        return seller;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        int depId = rs.getInt("DepId");
        String depName = rs.getString("DepName");

        Department department = new Department(depName);
        department.setId(depId);
        return department;
    }

    public List<Seller> findByDepartment(Department department) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        ResultSet result = null;

        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement(
                    "SELECT seller.*, department.Id AS DepId, department.Name AS DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE DepartmentId = ? "
                            + "ORDER BY seller.FullName");

            preparedCommand.setInt(1, department.getId());

            result = preparedCommand.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (result.next()) {
                Department dep = map.get(result.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instantiateDepartment(result);
                    map.put(result.getInt("DepartmentId"), dep);
                }

                Seller obj = instantiateSeller(result, dep);
                list.add(obj);
            }

            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(preparedCommand);
            DB.closeResultSet(result);
        }
    }

}
