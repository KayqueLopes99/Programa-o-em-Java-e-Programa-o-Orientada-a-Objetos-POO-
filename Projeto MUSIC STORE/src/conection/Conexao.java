package src.conection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/sistema";
    private static final String USER = "root"; // ou o usuário que você criou
    private static final String PASSWORD = "52746363kl"; // sua senha

    public static Connection getConexao() {
        try {
            // força o carregamento do driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
