package Estudantes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        System.out.println(getDateTime());
    }

    
    public static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    
}
