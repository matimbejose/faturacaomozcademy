package model.BusinessObject;

import model.DataAccessObject.ItemDAO;
import model.ValueObject.Item;

public class ManageItem {
    ItemDAO  ItemDAO = new ItemDAO();
    String sql;boolean res;
    
    public boolean salvarItem(Item im) {
        sql="INSERT INTO item (preco,tipo,nome) VALUES ('"+im.getPreco()+"', '"+im.getTipo()+"','"+im.getNome()+"');";
        res = ItemDAO.cadasTrarItem(sql);
        return res;
    }
    
}
