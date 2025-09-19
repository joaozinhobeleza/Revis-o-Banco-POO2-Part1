package DAO;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Conexão {
    
    public  static Connection conector() {
            
    java.sql.Connection conexao = null;

    String driver = "com.mysql.cj.jdbc.Driver";

    String url = "jdbc:mysql://localhost:3306/BancoRevisao";

    String user = "root";

    String password = "root";
    try {
    Class.forName(driver);

    conexao = DriverManager.getConnection(url, user, password);

    return conexao;

    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Conexão falhou: " + e.getMessage());

    return null;

         }
    
}
}
