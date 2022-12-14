package model.DataAccessObject;

import model.ValueObject.Usuario;

import javax.swing.*;
import java.sql.*;

public class UsuarioDAO {
    Connection conexao;

    public Boolean autenticarusuario(String query, Usuario objUsuario) {
        conexao = new Conectar_a_BD().conectaBD();
        boolean resp = false;
        try {

            PreparedStatement pstm = conexao.prepareStatement(query);
            pstm.setString(1, objUsuario.getNome());
            pstm.setString(2, objUsuario.getSenha());
            ResultSet rs = pstm.executeQuery();
            if (rs.next())
                resp = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + ex);
            resp = false;
        }

        return resp;
    }

}
