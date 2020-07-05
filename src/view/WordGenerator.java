package view;

import view.WordWriter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
 
public class WordGenerator extends WordWriter{
 
    
    
 
    //Word dokümanı oluştur.
    public void createWord(String[] gelenler) throws IOException {
       
            //Documan objesini yarat.
            XWPFDocument document;
            document = createWord();
            //Dokumanı FileSystem de yazdırmaya hazırla
            FileOutputStream out;
            out = createWord2();
            
            
            
            //Word'un içerisine yazı yaz. 
            for (int i=0;i < gelenler.length; i++)
            {
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText("\n"+ gelenler[i] + "\n");
            
            }
            document.write(out);
          
            //Dokumanı kapat
            out.close();
            System.out.println("YAZ" + "_" + ".docx" + " written successfully");
        
    }
}