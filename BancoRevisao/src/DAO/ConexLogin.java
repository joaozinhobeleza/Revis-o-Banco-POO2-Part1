package DAO;

import DTO.TesteConexão;
import javax.swing.JOptionPane;
import java.sql.*;

public class ConexLogin {
    
    public boolean entrar(TesteConexão login) {
        Connection conn = Conexão.conector();

        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco!");
            return false;
        }

        String sql = "SELECT * FROM tabela WHERE usuario = ? AND senha = ?";

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUsuario());
            pstm.setString(2, login.getSenha());

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Login falhou. Verifique suas credenciais.");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer login: " + e.getMessage());
            return false;
        }
    }
}
