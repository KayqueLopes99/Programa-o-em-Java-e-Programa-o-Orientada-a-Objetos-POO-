package Udemy.Aula_29_JDBC.MiniProjeto.src.aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DbException;

import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DB;

public class Operations {

    public static void insertDatas(String name, String email, Date birthDate, double baseSalary, int departmentId) {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            connection = DB.getConnection();

            // String sql
            preparedComand = connection.prepareStatement(
                    "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            // Statement.RETURN_GENERATED_KEYS -> para retornar o ID gerado automaticamente
            // ? -> paa colocar o dado que ser inserido com o comando setType("data")

            preparedComand.setString(1, name);
            preparedComand.setString(2, email);
            preparedComand.setDate(3, new java.sql.Date(sdf.parse(sdf.format(birthDate)).getTime()));
            preparedComand.setDouble(4, baseSalary);
            preparedComand.setInt(5, departmentId);

            // Executar o comando
            int rowsAffected = preparedComand.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet resultId = preparedComand.getGeneratedKeys();
                while (resultId.next()) {
                    // Id da primeira coluna.
                    int id = resultId.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
                System.out.println("Done! Rows affected: " + rowsAffected);
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

    public static void updateDatas() {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        try {
            connection = DB.getConnection();

            // String sql
            preparedComand = connection.prepareStatement(
                    "UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");

            preparedComand.setDouble(1, 200.0);
            preparedComand.setInt(2, 2);

            // Executar o comando
            int rowsAffected = preparedComand.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Done! Rows affected: " + rowsAffected);
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(preparedComand);

        }
    }
    public static void deleteDatas() {
        Connection connection = null;
        PreparedStatement preparedComand = null;
        try {
            connection = DB.getConnection();

            // String sql
            preparedComand = connection.prepareStatement("DELETE FROM department WHERE Id = ?");

            preparedComand.setInt(1, 5);

            // Executar o comando
            int rowsAffected = preparedComand.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedComand);
        }

    }
    public static void transactionalUpdate() {
        Connection connection = null;
        Statement preparedComand = null;
        try {
            connection = DB.getConnection();
            // Desativar o auto-commit
            connection.setAutoCommit(false); // iniciar a transação
            // Desativar o auto-commit
            connection.setAutoCommit(false); // iniciar a transação

            preparedComand = connection.createStatement(); // criar o comando

            int rows1 = preparedComand.executeUpdate(
                    "UPDATE seller SET BaseSalary = 2090 WHERE (DepartmentId = 1)");

            int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }

            int rows2 = preparedComand.executeUpdate(
                    "UPDATE seller SET BaseSalary = 3090 WHERE (DepartmentId = 2)");

            System.out.println("Rows1 = " + rows1);
            System.out.println("Rows2 = " + rows2);

            connection.commit(); // confirmar a transação

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback!\nCaused:" + e1.getMessage());
            } // desfazer a transação
            finally {
                DB.closeStatement(preparedComand);
            }
        }

    }
}
