package model.DataAccessObject;

import model.ValueObject.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudanteDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    
    
public  List<Estudante> read(){
    Connection conn = new Conectar_a_BD().conectaBD();
    PreparedStatement pstm = null;
    ResultSet rs = null;

    List<Estudante> estudantes =new ArrayList<>();

    String sql ="select idestudante, nome, nivel, nomeItem, status, data_inscricao from estudante";
   try {
    pstm = conn.prepareStatement(sql);
    rs = pstm.executeQuery();
    while(rs.next()){
        Estudante est = new Estudante();
        est.setIdEstudante(rs.getInt("idestudante"));
        est.setNome(rs.getString("nome"));
        est.setNivel(rs.getString("nivel"));
        est.setnomeItem(rs.getString("nomeItem"));
        est.setStatus(rs.getString("status"));
        est.setData_inscriao(rs.getString("data_inscricao"));
        estudantes.add(est);
    }
    rs.close();
   } catch (SQLException e) {
    // TODO: handle exception
   }

   return estudantes;
}

    public ResultSet contaRegulares(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante)from estudante where status= ?";
            PreparedStatement pstm = conexao.prepareStatement(query);

            pstm.setString(1,"R");
            ResultSet rs = pstm.executeQuery();
            return rs;


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "UsuarioDAO"+ex);
            return null;
        }
    }

    public ResultSet contaIrreg(){
        conexao = new Conectar_a_BD().conectaBD();

        try{
            String query="select count(idEstudante)from estudante where status= ?";
            PreparedStatement pstm = conexao.prepareStatement(query);

            pstm.setString(1,"NR");
            ResultSet rs = pstm.executeQuery();
            return rs;


        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "UsuarioDAO"+ex);
            return null;
        }
    }


    public boolean cadasTrarEstudante(String sql){
        conexao = new Conectar_a_BD().conectaBD();
        boolean resp = false;

        try{
            PreparedStatement pstm = conexao.prepareStatement(sql);
            int i = pstm.executeUpdate();
            if(i==1)
            resp=true;

            return resp;
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "EstudanteDAO : "+ex);
            return resp;
        }     
    }

    // public  ResultSet listarEstudante() {
    //     conexao = new Conectar_a_BD().conectaBD();
    //     String sql = "select * from estudante;";
    //     try {
    //         PreparedStatement pstm = conexao.prepareStatement(sql);
    //         ResultSet rs = pstm.executeQuery(sql);
    //         return rs;
    //     }catch (Exception ex){
    //         System.out.println(ex.getMessage());
    //         return null;
    //     }
    // }



}