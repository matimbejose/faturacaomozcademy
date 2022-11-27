package model.BusinessObject;

import model.DataAccessObject.EstudanteDAO;
import model.ValueObject.Estudante;

public class ManageEstudante {
    
    public boolean salvarEstutante(Estudante student) {
        String sql="INSERT INTO estudante (nome,contacto,valorPago,hora,nivel,nomeItem,data_inscricao) VALUES ('"+student.getNome()+"', '"+student.getContacto()+"','"+student.getValorPago()+"','"+student.getHora()+"','"+student.getNivel()+"','"+student.getNomeItem()+"','"+student.getData_inscriao()+"')";
        ;
                

        EstudanteDAO  estudanteDao = new EstudanteDAO();
        boolean res = estudanteDao.cadasTrarEstudante(sql);
        return res;
    }

    
    
}
