package model.DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar_a_BD {
    Connection conector;

    public Connection conectaBD(){
        try {
            this.conector = DriverManager.getConnection("jdbc:mysql://localhost:3306/mozacademydb?useSSL-false","root","elihudcl777");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return conector;
    }


}
