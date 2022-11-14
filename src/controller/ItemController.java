package controller;

import model.BusinessObject.ManageDisciplina;
import model.ValueObject.Item;
import model.ValueObject.Validar;


public class ItemController {
 
    
    public boolean cadastrar(String nome, float preco,String nivel, String tipo){
        ManageDisciplina mD =new ManageDisciplina();
        Validar vd = new Validar();
  

        if(vd.validarString(nome, 5, 45) && vd.validarFloat(preco, 100, 20021) && vd.validarString(tipo, 4, 15)== true){      
            Item DisciplinaItem = new Item(nome, preco, tipo, nivel);
            boolean resposta =mD.salvarDisciplina(DisciplinaItem);
            return resposta;
        }
            return false;
    }


}
