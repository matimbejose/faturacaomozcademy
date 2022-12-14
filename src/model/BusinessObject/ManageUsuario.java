package model.BusinessObject;

import model.DataAccessObject.UsuarioDAO;
import model.ValueObject.Usuario;

public class ManageUsuario {
    
    public boolean verificarUsuario(Usuario user) {
        String sql="select*from usuario where nome= ? and senha = ?";
                

        UsuarioDAO  UserDao = new UsuarioDAO();
        boolean res = UserDao.autenticarusuario(sql, user);
        return res;
    }

    
    
}
