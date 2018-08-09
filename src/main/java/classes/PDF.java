/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author tnogales
 */

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

import java.text.DecimalFormat;

public class PDF {
    public static void main(String[] args) throws IOException 
    {
        //System.out.println("https://pdfbox.apache.org");
        
        //Creating an Empty Document 
        PDDocument document = new PDDocument();

        //Loading an Existing PDF Document
        //File file; 
        //file = new File("C:/pdfbox/archivo.pdf");
        //PDDocument.load(file); 
        
        //Creating a Blank Page
        PDPage my_page = new PDPage();
        
        //Adding Page to the Document
        document.addPage(my_page);
        
        //Saving the Document
        //On recent versions of Windows, you cannot write to the root folder of 
        //the system drive without elevated privileges. 
        document.save("C:/pdfbox/my_doc.pdf");
        
        //Closing the Document
        document.close();
        

        /*
        //Loading an existing document
        File file = new File("C:/pdfbox/archivo.pdf");
        PDDocument document = PDDocument.load(file);

        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();

        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);
        System.out.println(text);

        
        DecimalFormat formateador = new DecimalFormat("###,###.##");
        
        Boolean found;
        found = text.contains( formateador.format (76100716) );
        System.out.println(found);
      
        //Closing the document
        document.close();
        */
        
        
        
    }    
}
