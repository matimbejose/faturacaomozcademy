package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BusinessObject.ManageItem;
import model.DataAccessObject.ItemDAO;
import model.ValueObject.Item;
import model.ValueObject.Validar;

public class ItemController {
    Validar vd = new Validar();
    ManageItem mi = new ManageItem();

    public boolean ValidarItem(String nome, String  tipo, float preco) {
        boolean resposta  = false;

        if(vd.validarString(nome, 2, 45)==true && vd.validarString(tipo, 3, 30) ==true  && vd.validarFloat(preco, 400, 90000) == true ) { 

        Item im = new Item(nome, preco, tipo);
           mi.salvarItem(im);
           resposta  = true;
        } 

        return resposta;
}

public List<model.ValueObject.Item> readF(){
    List<model.ValueObject.Item> forms =new ArrayList<>();
    forms = new ItemDAO().readFormacoes();

    return forms;
   }


   public List<model.ValueObject.Item> readD(){
    List<model.ValueObject.Item> disc =new ArrayList<>();
    disc = new ItemDAO().readDisciplinas();

    return disc;
   }



 public String[] discMaisProc(){
        String maximoooo[] = new String[2];
       
        String mat[]= new String[2];
            
        String port[]= new String[2];
        //String fis[]= new String[2];
        String filo[]= new String[2];
            
        ResultSet rsMat = new ItemDAO().contarMatematica();
        ResultSet rsPort = new ItemDAO().contarPortugues();
        //ResultSet rsFis = new ItemDAO().contarFisica();
        ResultSet rsFilo = new ItemDAO().contarFilosofia();
        try {
           if(rsMat.next()){
            mat[1]=String.valueOf(rsMat.getString(2));
           }

           if(rsPort.next()){
            port[1]=String.valueOf(rsPort.getString(2));
           }

        //    if(rsFis.next()){
        //     fis[1]=String.valueOf(rsFis.getString(2));
        //    }

           if(rsFilo.next()){
            filo[1]=String.valueOf(rsFilo.getString(2));
           }

           if(rsMat.getInt(1)>rsPort.getInt(1)  && rsMat.getInt(1)>rsFilo.getInt(1) ){
           maximoooo[0]="Matematica";
           maximoooo[1]=mat[1];
            
           }else if(rsPort.getInt(1)>rsMat.getInt(1)  && rsPort.getInt(1)>rsFilo.getInt(1) ){
            maximoooo[0]="Portugues";
           maximoooo[1]=port[1];
             
        //     }else if(rsFis.getInt(1)>rsMat.getInt(1) && rsFis.getInt(1)>rsPort.getInt(1) && rsFis.getInt(1)>rsFilo.getInt(1) ){
        //         maximoooo[0]="Fisica";
        //    maximoooo[1]=fis[1];
                 
                }else if(rsFilo.getInt(1)>rsMat.getInt(1) && rsFilo.getInt(1)>rsPort.getInt(1)  ){
                    maximoooo[0]="Filosofia";
           maximoooo[1]=filo[1];
                     
                }

        } catch (SQLException e) {
            // TODO: handle exception
        }
        return maximoooo;
    }

    public String[] discMenosProc(){
        String maximoooo[] = new String[2];
        String mat[]= new String[2];
            
        String port[]= new String[2];
        //String fis[]= new String[2];
        String filo[]= new String[2];
            
        ResultSet rsMat = new ItemDAO().contarMatematica();
        ResultSet rsPort = new ItemDAO().contarPortugues();
        //ResultSet rsFis = new ItemDAO().contarFisica();
        ResultSet rsFilo = new ItemDAO().contarFilosofia();

      
       

        try {
           if(rsMat.next()){
            mat[1]=String.valueOf(rsMat.getString(2));
           }

           if(rsPort.next()){
            port[1]=String.valueOf(rsPort.getString(2));
           }

        //    if(rsFis.next()){
        //     fis[1]=String.valueOf(rsFis.getString(2));
        //    }

           if(rsFilo.next()){
            filo[1]=String.valueOf(rsFilo.getString(2));
           }

           if(rsMat.getInt(1)<rsPort.getInt(1)  && rsMat.getInt(1)<rsFilo.getInt(1) ){
           maximoooo[0]="Matematica";
           maximoooo[1]=mat[1];
            
           }else if(rsPort.getInt(1)<rsMat.getInt(1)  && rsPort.getInt(1)<rsFilo.getInt(1) ){
            maximoooo[0]="Portugues";
           maximoooo[1]=port[1];
             
        //     }else if(rsFis.getInt(1)>rsMat.getInt(1) && rsFis.getInt(1)>rsPort.getInt(1) && rsFis.getInt(1)>rsFilo.getInt(1) ){
        //         maximoooo[0]="Fisica";
        //    maximoooo[1]=fis[1];
                 
                }else if(rsFilo.getInt(1)<rsMat.getInt(1) && rsFilo.getInt(1)<rsPort.getInt(1)  ){
                    maximoooo[0]="Filosofia";
           maximoooo[1]=filo[1];
                     
                    }
        } catch (SQLException e) {
            // TODO: handle exception
        }
   
        return maximoooo;
    }



    public String[] formMaisProc(){
        String maximoooo[] = new String[2];
       
        String powerP[]= new String[2];
            
        String excel[]= new String[2];
        String word[]= new String[2];
            
        ResultSet rspowerP = new ItemDAO().contarMatematica();
        ResultSet rsExcel = new ItemDAO().contarPortugues();
        //ResultSet rsFis = new ItemDAO().contarFisica();
        ResultSet rsWord = new ItemDAO().contarFilosofia();
        try {
           if(rspowerP.next()){
            powerP[1]=String.valueOf(rspowerP.getString(2));
           }

           if(rsExcel.next()){
            excel[1]=String.valueOf(rsExcel.getString(2));
           }

        //    if(rsFis.next()){
        //     fis[1]=String.valueOf(rsFis.getString(2));
        //    }

           if(rsWord.next()){
            word[1]=String.valueOf(rsWord.getString(2));
           }

           if(rspowerP.getInt(1)>rsExcel.getInt(1)  && rspowerP.getInt(1)>rsWord.getInt(1) ){
           maximoooo[0]="Power Point";
           maximoooo[1]=powerP[1];
            
           }else if(rsWord.getInt(1)>rspowerP.getInt(1)  && rsWord.getInt(1)>rsExcel.getInt(1) ){
            maximoooo[0]="Word";
           maximoooo[1]=word[1];
        
                 
                }else if(rsExcel.getInt(1)>rspowerP.getInt(1) && rsExcel.getInt(1)>rsWord.getInt(1)  ){
                    maximoooo[0]="Excel";
           maximoooo[1]=excel[1];
                     
                }

        } catch (SQLException e) {
            // TODO: handle exception
        }
        return maximoooo;
    }


    public String[] formMenosProc(){
        String maximoooo[] = new String[2];
       
        String powerP[]= new String[2];
            
        String excel[]= new String[2];
        String word[]= new String[2];
            
        ResultSet rspowerP = new ItemDAO().contarMatematica();
        ResultSet rsExcel = new ItemDAO().contarPortugues();
        //ResultSet rsFis = new ItemDAO().contarFisica();
        ResultSet rsWord = new ItemDAO().contarFilosofia();
        try {
           if(rspowerP.next()){
            powerP[1]=String.valueOf(rspowerP.getString(2));
           }

           if(rsExcel.next()){
            excel[1]=String.valueOf(rsExcel.getString(2));
           }

        

           if(rsWord.next()){
            word[1]=String.valueOf(rsWord.getString(2));
           }

           if(rspowerP.getInt(1)<rsExcel.getInt(1)  && rspowerP.getInt(1)<rsWord.getInt(1) ){
           maximoooo[0]="Power Point";
           maximoooo[1]=powerP[1];
            
           }else if(rsWord.getInt(1)<rspowerP.getInt(1)  && rsWord.getInt(1)<rsExcel.getInt(1) ){
            maximoooo[0]="Word";
           maximoooo[1]=word[1];
        
                 
                }else if(rsExcel.getInt(1)<rspowerP.getInt(1) && rsExcel.getInt(1)<rsWord.getInt(1)  ){
                    maximoooo[0]="Excel";
           maximoooo[1]=excel[1];
                     
                }

        } catch (SQLException e) {
            // TODO: handle exception
        }
        return maximoooo;
    }


}
