package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Udemy.Aula_29_JDBC.MiniProjeto.src.aplication.DBIntegrityException;
import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DB;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.SellerDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Seller;

import java.util.Date;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void deleteById(int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");

            preparedCommand.setInt(1, id);

            // Executar o comando
            int rowsAffected = preparedCommand.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done! Department deleted.");
            } else {
                System.out.println("Department not found. Nothing was deleted.");
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
        PreparedStatement preparedComand = null;

        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement(
                    "SELECT seller.* , department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id ORDER BY Name");

            ResultSet result = preparedComand.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("fullName");
                String email = result.getString("email");
                Date birthDate = result.getDate("birthDate");
                double baseSalary = result.getDouble("baseSalary");

                Seller seller = new Seller(nome, email, birthDate, baseSalary);
                seller.setId(id);

                listSellers.add(seller);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);
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
            String sql = "SELECT seller.*, department.Name AS DepName " +
                    "FROM seller " +
                    "INNER JOIN department ON seller.DepartmentId = department.Id " +
                    "WHERE seller.Id = ?";

            preparedCommand = connection.prepareStatement(sql);
            preparedCommand.setInt(1, id); // define o parâmetro ANTES de executar

            result = preparedCommand.executeQuery();

            if (result.next()) {
                String nome = result.getString("FullName");
                String email = result.getString("email");
                Date birthDate = result.getDate("birthDate");
                double baseSalary = result.getDouble("baseSalary");

                seller = new Seller(nome, email, birthDate, baseSalary);
                seller.setId(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

        if (seller == null) {
            System.out.println("Seller not found!");
        }

        return seller;
    }

    @Override
    public void insert(Seller seller, int departmentId) {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement(
                    "INSERT INTO seller (fullName, email, birthDate, baseSalary, departmentId) VALUES (?, ?, ?, ?, ?)");

            preparedComand.setString(1, seller.getName());
            preparedComand.setString(2, seller.getEmail());
            preparedComand.setDate(3, new java.sql.Date(sdf.parse(sdf.format(seller.getBirthDate())).getTime()));
            preparedComand.setDouble(4, seller.getBaseSalary());

            // Verifica se o departamento existe
            PreparedStatement checkDeptStmt = connection.prepareStatement("SELECT id FROM department WHERE id = ?");
            checkDeptStmt.setInt(1, departmentId);
            ResultSet deptResult = checkDeptStmt.executeQuery();
            if (!deptResult.next()) {
                throw new SQLException("Departamento com id " + departmentId + " não existe."); // insere ? não
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
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);
        }

    }

    @Override
    public void update(Seller seller, int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DB.getConnection();

            // Atualizando o seller existente
            preparedCommand = connection.prepareStatement(
                    "UPDATE seller SET fullName = ?, email = ?, birthDate = ?, baseSalary = ? WHERE id = ?");

            preparedCommand.setString(1, seller.getName());
            preparedCommand.setString(2, seller.getEmail());
            preparedCommand.setDate(3, new java.sql.Date(
            sdf.parse(sdf.format(seller.getBirthDate())).getTime()));
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
        } catch (ParseException e) {
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
                // Se não existir nenhum registro, retorna 1
                return (lastId == 0) ? 1 : lastId + 1;
            } else {
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // retorna -1 em caso de erro
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

    }
}
