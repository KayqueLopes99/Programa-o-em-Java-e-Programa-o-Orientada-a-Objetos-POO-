package Udemy.Aula_29_JDBC.MiniProjeto.src.aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import Udemy.Aula_29_JDBC.MiniProjeto.src.db.DB;

public class Program {
    public static void main(String[] args) {

        // Connection -> conectar
        // Statement -> executar comandos SQL
        // ResultSet -> armazenar o resultado de um comando SQL
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // SELEÇÃO DE DADOS.
        try {
            connection = DB.getConnection();
            statement = connection.createStatement();

            // executeQuery -> recebe um comando formatado em String
            resultSet = statement.executeQuery("SELECT * FROM department");

            // Existe métodos resultSet.getType("NOME_DO_CAMPO"), segundo o tipo do dado.
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);

        }

        try {
            // INSERÇÕES
            Operations.insertDatas("Carl Purple", "Carl@gmail.com", new java.util.Date(), 3000.0, 4);

            // UPDATES
            Operations.updateDatas();

            // DELETES
            Operations.deleteDatas();

            // TRANSAÇÕES
            Operations.transactionalUpdate();
        } finally {
            DB.closeConnection(); 
        }

    }
}


