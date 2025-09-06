package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Udemy.Aula_29_JDBC.MiniProjeto.src.aplication.DBIntegrityException;
import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DB;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DepartmentDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

    @Override
    public void deleteById(int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        try {
            connection = DB.getConnection();

            preparedCommand = connection.prepareStatement(
                    "DELETE FROM department WHERE Id = ?");
            preparedCommand.setInt(1, id);

            // Executar o comando e capturar o número de linhas afetadas
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
    public List<Department> findAll() {
        List<Department> listDepartments = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedComand = null;

        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement("SELECT * FROM department ORDER BY name");

            ResultSet result = preparedComand.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("name");

                Department department = new Department(nome);
                department.setId(id);

                listDepartments.add(department);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);
        }

        return listDepartments;
    }

    @Override
    public Department findById(int id) {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        Department department = null;
        ResultSet result = null;
        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement("SELECT * FROM department WHERE Id = ?");
            preparedCommand.setInt(1, id);
            result = preparedCommand.executeQuery();

            if (result.next()) {
                String nome = result.getString("name");
                department = new Department(nome);
                department.setId(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeResultSet(result);
            DB.closeStatement(preparedCommand);
        }

        if (department == null) {
            System.out.println("Department not found!");
        }

        return department;
    }

    @Override
    public void update(Department department, int id) {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement("UPDATE department SET name = ? WHERE Id = ?");

            preparedComand.setString(1, department.getName());
            preparedComand.setInt(2, id);

            int rowsAffected = preparedComand.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Done! department updated!");

            } else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);
        }

    }

    @Override
    public void insert(Department department) {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        try {
            connection = DB.getConnection();

            preparedComand = connection.prepareStatement(
                    "INSERT INTO department (name) VALUES (?)");

            preparedComand.setString(1, department.getName());

            int rowsAffected = preparedComand.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Done! department inserted!");

            } else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);
        }

    }

    public static int getMaxId() {
        Connection connection = null;
        PreparedStatement preparedCommand = null;
        ResultSet result = null;
        try {
            connection = DB.getConnection();
            preparedCommand = connection.prepareStatement("SELECT MAX(id) AS max_id FROM department");
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
