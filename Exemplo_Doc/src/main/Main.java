package main;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Main {
 
    public static void main(String[] args) throws Exception {

        Document doc = null;
        OutputStream os = null;
        LocalDate localDate = LocalDate.now();//For reference
 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
    
        String data = localDate.format(formatter);

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream("C://Users//Laboratorio-Info//Documents//out.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();
            String paciente = JOptionPane.showInputDialog(null, "Digite o seu nome completo: ");
            
            //adiciona o texto ao PDF
            Font f = new Font(FontFamily.COURIER, 22, Font.BOLD);
            
            Paragraph par = new Paragraph("Atestado Médico");
            par.setAlignment(Element.ALIGN_CENTER);
            par.setSpacingBefore(15);
            par.setSpacingAfter(30);
            doc.add(par);
            
            Paragraph par2 = new Paragraph("Atesto que atendi nessa data o(a) Sr(a)" + paciente + " às 7:00 horas, sendo necessário o seu afastamento do local de trabalho ou escola por 1 (UM) dia(s), a partir de " + data + " tendo como causa do atendimento o código abaixo:");
            par2.setSpacingAfter(20);
            doc.add(par2);
            
            
            Paragraph par3 = new Paragraph("CID 10-J11");
            par3.setSpacingAfter(2);
            doc.add(par3);
            
            Paragraph par4 = new Paragraph(".........");
            par4.setSpacingAfter(2);
            doc.add(par4);
            
            
            Paragraph par5 = new Paragraph("Código da Doença");
            par5.setSpacingAfter(30);
            doc.add(par5);
            
            Paragraph par6 = new Paragraph("SÃO PAULO, 03 de Junho de 2026");
            par6.setAlignment(Element.ALIGN_CENTER);
            par6.setSpacingAfter(10);
            doc.add(par6);
            
            Paragraph par7 = new Paragraph("Assinatura do médico");
            par7.setAlignment(Element.ALIGN_CENTER);
            par7.setSpacingAfter(10);
            doc.add(par7);
            
            Image img = Image.getInstance("C://Users//Laboratorio-Info//Downloads//assinatura.png");
            img.setAlignment(Element.ALIGN_CENTER);
            doc.add(img);
            
            Paragraph par8 = new Paragraph("Carlos Eduardo Bueno de Souza" + "                                                                " + data);
            par8.setSpacingBefore(30);
            doc.add(par8);

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        
        Desktop.getDesktop().open(new File("C://Users//Laboratorio-Info//Documents//out.pdf"));
    }
    
}
