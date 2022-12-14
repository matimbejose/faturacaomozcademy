package model.BusinessObject;

import model.DataAccessObject.EstudanteDAO;
import model.ValueObject.Estudante;

public class ManageEstudante {
    EstudanteDAO  estudanteDao = new EstudanteDAO();
    String sql;boolean res;
    
    public boolean salvarEstutante(Estudante student) {
        sql="INSERT INTO estudante (nome,contacto,valorPago,hora,nivel,nomeItem,data_inscricao) VALUES ('"+student.getNome()+"', '"+student.getContacto()+"','"+student.getValorPago()+"','"+student.getHora()+"','"+student.getNivel()+"','"+student.getNomeItem()+"','"+student.getData_inscriao()+"')";
        ;
                
        res = estudanteDao.cadasTrarEstudante(sql);
        return res;
    }



    
    
}
