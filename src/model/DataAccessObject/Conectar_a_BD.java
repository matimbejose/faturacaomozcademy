package model.DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar_a_BD {
    Connection conector;
    String userDb = "root";
    String passwordDv = "1234";



    public Connection conectaBD(){
        try {
            this.conector = DriverManager.getConnection("jdbc:mysql://localhost:3306/mozacademydatabase?useSSL-false",userDb,passwordDv);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return conector;
    }


    


}
