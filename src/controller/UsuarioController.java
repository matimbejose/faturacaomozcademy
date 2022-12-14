package controller;

import model.BusinessObject.ManageUsuario;
import model.ValueObject.Usuario;
import model.ValueObject.Validar;


public class UsuarioController {
ManageUsuario mU = new ManageUsuario();
Validar vd = new Validar();

    
    public boolean ValidarUsuario(String nome, String senha) {
        boolean resposta  = false;

        if(vd.validarString(nome, 3, 15) == true && vd.validarString(senha, 3, 12) == true) {
            Usuario user = new Usuario();
            user.setNome(nome);
            user.setSenha(senha);

            mU.verificarUsuario(user);
            resposta = true;
        }
            return resposta;
    }


}
