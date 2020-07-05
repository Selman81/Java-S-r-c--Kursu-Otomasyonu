package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


public class WordWriter{
    
    public XWPFDocument createWord() throws FileNotFoundException{
        XWPFDocument document = new XWPFDocument();
        return document;
           
    }
    
     public FileOutputStream createWord2() throws FileNotFoundException{
        
        FileOutputStream out = new FileOutputStream(new File("YAZ" + "_" + ".docx"));
        return out;
    }
    
    
    
}