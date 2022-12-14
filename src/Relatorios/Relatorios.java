package Relatorios;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import java.io.*;
import java.util.Calendar;
import java.awt.Desktop;

public class Relatorios {
 
    

    public void regerarRecebicoEstudante(String nome, String data,String item1, String item2, String item3,float valorPago)  {
        Calendar cal = Calendar.getInstance();
        String hora = cal.get(Calendar.HOUR)+"_"+cal.get(Calendar.MINUTE);
        try {
            Document document = new  Document();
            PdfWriter.getInstance(document, new FileOutputStream(hora+".pdf"));
            document.open();
            document.add(new Paragraph("Nome do estudante : " +nome));
            document.add(new Paragraph("Data de Inscricao : " +data));
            document.add(new Paragraph("Hora de Inscricao : "+ hora));
            document.add(new Paragraph("Item(s) :"+item1+","+item2+","+item3));
            document.add(new Paragraph("Valor Pago: "+valorPago));
    
            document.close();
    
            Desktop  desk = null;
            if(Desktop.isDesktopSupported()) {
                desk = Desktop.getDesktop();
                desk.open(new File(hora+".pdf"));
            }
            
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        } catch(IOException i) {
            System.out.println(i.getMessage());
        }
       
    }
}

