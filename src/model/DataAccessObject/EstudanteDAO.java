package model.DataAccessObject;

import model.ValueObject.Estudante;

import java.sql.Connection;
import java.sql.ResultSet;

public class EstudanteDAO {
    Connection conexao;

    public void listarEstudantes(Estudante objEstudante){
        conexao = new Conectar_a_BD().conectaBD();



    }
}
