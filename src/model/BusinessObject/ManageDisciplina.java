package model.BusinessObject;

import model.DataAccessObject.ItemDAO;
import model.ValueObject.Item;

public class ManageDisciplina {
    
    public boolean salvarDisciplina(Item disciplina){
        String sql="INSERT INTO item (nome, preco, nivel, tipo) VALUES ("+disciplina.getNome()+", "+disciplina.getPreco()
        +", "+disciplina.getNivel()+", "+disciplina.getTipo()+")";


        ItemDAO  disciplinaDao = new ItemDAO();
        boolean res=disciplinaDao.createDisciplina(sql);
        return res;
    }
    
}
