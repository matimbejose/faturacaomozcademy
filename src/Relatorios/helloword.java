package Relatorios;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import java.io.*;
import java.awt.Desktop;


public class helloword {
    

    public static void main(String[] args) throws DocumentException, IOException {
        Document document = new  Document();
        PdfWriter.getInstance(document, new FileOutputStream("hello.pdf"));
        document.open();
        document.add(new Paragraph("hello my name is...."));
        document.close();


        Desktop  desk = null;
        if(Desktop.isDesktopSupported()) {
            desk = Desktop.getDesktop();
            desk.open(new File("hello.pdf"));
        }
    }
}
