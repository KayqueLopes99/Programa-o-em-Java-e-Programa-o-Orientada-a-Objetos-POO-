package Udemy.Aula_29_JDBC.ProjectDepartment.src.db;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static Connection connection = null;

    // Método que retorna a conexão com o banco de dados
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                connection = DriverManager.getConnection(url, props);
            } 
            
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }



    // Método que fecha a conexão com o banco de dados
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }



    /* Método que carrega o arquivo db.properties e retorna um objeto do tipo Properties
    */
    private static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs); // leitura dos dados no properties
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        } 

    }


    public static void closeStatement(java.sql.Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(java.sql.ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}

