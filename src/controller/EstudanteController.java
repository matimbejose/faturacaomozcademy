package controller;


import java.util.ArrayList;
import java.util.List;

import Relatorios.Relatorios;
import model.BusinessObject.ManageEstudante;
import model.DataAccessObject.EstudanteDAO;
import model.ValueObject.Estudante;
import model.ValueObject.Validar;


public class EstudanteController {
ManageEstudante mD = new ManageEstudante();
Validar vd = new Validar();
Relatorios r = new Relatorios();

    
public List<model.ValueObject.Estudante> read(){
    List<model.ValueObject.Estudante> estudantes =new ArrayList<>();
    estudantes = new EstudanteDAO().read();

    return estudantes;
   }

    public boolean cadastrarEstudante(String nome, float valorPago, String contacto, String nivel, String item1, String item2, String item3, String hora) {
        boolean resposta  = false;

        if(vd.validarString(nome, 2, 45)==true && vd.validarFloat(valorPago, 500, 100000)==true && vd.validarString(contacto, 9, 10)==true && vd.validarString(nivel, 0,2 )== true && vd.validarString(item1, 2, 15)== true  && vd.validarString(item2, 2, 15) ==  false && vd.validarString(item3, 2, 15) == false  && vd.validarString(hora, 5,9 ) == true) { 

           Estudante est1 = new Estudante(nome, contacto, valorPago, nivel, hora, item1);
           mD.salvarEstutante(est1);
           resposta  = true;
           
           r.regerarRecebicoEstudante(nome, hora, item1, item2, item3, valorPago);
        }  else if (vd.validarString(nome, 2, 45)==true && vd.validarFloat(valorPago, 500, 100000)==true && vd.validarString(contacto, 9, 10)==true && vd.validarString(nivel, 0,2 )== true && vd.validarString(item1, 2, 15)== true && vd.validarString(item2, 2, 15) == true && vd.validarString(item3, 2, 15) == false  && vd.validarString(hora, 5,9 )== true) {

        
        Estudante est1 = new Estudante(nome, contacto, valorPago, nivel, hora, item1);
        Estudante est2= new Estudante(nome, contacto, valorPago, nivel, hora, item2);
        mD.salvarEstutante(est1);
        mD.salvarEstutante(est2);
        r.regerarRecebicoEstudante(nome, hora, item1, item2, item3, valorPago);
        resposta = true;

        }  else if (vd.validarString(nome, 2, 45)==true && vd.validarFloat(valorPago, 500, 100000)==true && vd.validarString(contacto, 9, 10)==true && vd.validarString(nivel, 0,2 )== true && vd.validarString(item1, 2, 15)== true && vd.validarString(item2, 2, 15) == true && vd.validarString(item3, 2, 15) == true   && vd.validarString(hora, 5,9 )== true) {



            Estudante est1 = new Estudante(nome, contacto, valorPago, nivel, hora, item1);
            Estudante est2= new Estudante(nome, contacto, valorPago, nivel, hora, item2);
            Estudante est3= new Estudante(nome, contacto, valorPago, nivel, hora, item3);
            mD.salvarEstutante(est1);
            mD.salvarEstutante(est2);
            mD.salvarEstutante(est3);
            r.regerarRecebicoEstudante(nome, hora, item1, item2, item3, valorPago);
            resposta = true;
        }

            return resposta;
    }


    // public  ResultSet listarEstudantes() {
    //     return new EstudanteDAO().listarEstudante();
    // }


}
