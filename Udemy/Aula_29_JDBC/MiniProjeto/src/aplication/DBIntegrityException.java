package Udemy.Aula_29_JDBC.MiniProjeto.src.aplication;

public class DBIntegrityException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    public DBIntegrityException(String msg) {
        super(msg);
    }
    
}
