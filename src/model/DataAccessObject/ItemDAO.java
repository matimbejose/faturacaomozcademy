package model.DataAccessObject;

import javax.swing.*;

import model.ValueObject.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;

    public boolean cadasTrarItem(String sql){
        conexao = new Conectar_a_BD().conectaBD();
        boolean resp = false;

        try{
            PreparedStatement pstm = conexao.prepareStatement(sql);
            int i = pstm.executeUpdate();
            if(i==1)
            resp=true;

            return resp;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO : "+ex);
        }
            return resp;
        }     


        public  List<Item> readFormacoes(){
            Connection conn = new Conectar_a_BD().conectaBD();
            PreparedStatement pstm = null;
            ResultSet rs = null;
        
            List<Item> formacoes =new ArrayList<>();
        
            String sql ="select iditem, nome, preco from item where tipo = 'formacao'";
           try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Item item = new Item();
                item.setIdItem(rs.getInt("iditem"));
                item.setNome(rs.getString("nome"));
                item.setPreco(rs.getFloat("preco"));
                 formacoes.add(item);
            }
            rs.close();
           } catch (SQLException e) {
            // TODO: handle exception
           }

           return formacoes;

}


public  List<Item> readDisciplinas(){
    Connection conn = new Conectar_a_BD().conectaBD();
    PreparedStatement pstm = null;
    ResultSet rs = null;

    List<Item> formacoes =new ArrayList<>();

    String sql ="select*from item where tipo = 'disciplina'";
   try {
    pstm = conn.prepareStatement(sql);
    rs = pstm.executeQuery();
    while(rs.next()){
        Item est = new Item();
        est.setIdItem(rs.getInt("iditem"));
        est.setNome(rs.getString("nome"));
        est.setPreco(rs.getFloat("preco"));
         formacoes.add(est);

    }
    rs.close();
   } catch (SQLException e) {
    // TODO: handle exception
   }

   return formacoes;
}

   
    public boolean createDisciplina(String sql){
        conexao = new Conectar_a_BD().conectaBD();
        PreparedStatement pstm=null;
        try {
            
            pstm=conexao.prepareStatement(sql);
            pstm.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("ERRO "+ex);
            return false;
        }
    }

    public ResultSet contarMatematica(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='matematica'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }

    public ResultSet contarPortugues(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='portugues'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }

    
    public ResultSet contarFilosofia(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='filosofia'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }

    public ResultSet contarExcel(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='excel'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }

    public ResultSet contarPowerP(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='powerPoint'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }
    public ResultSet contarWord(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante), sum(valorPago) from estudante where nomeItem ='word'";
            PreparedStatement pstm = conexao.prepareStatement(query);
            rs = pstm.executeQuery();
            return rs;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "ItemDAO"+ex);
            return null;
        }
    }
    




}
