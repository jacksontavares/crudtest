package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionMySql {
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;

    public void OpenDatabase()throws Exception{
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/crud_cliente";
        String user = "postgres";  //Seu nome de usuário.
        String password = "postgres";  //Sua senha, nesse caso o Banco esta sem senha.
        con = DriverManager.getConnection(url, user, password);
    }

    public void CloseDatabase() throws Exception{
        if(con != null){
            con.close();
        }
    }    
}