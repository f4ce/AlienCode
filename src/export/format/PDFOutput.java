/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package export.format;

import aliencode.Alien;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author Shivansh
 */
public class PDFOutput extends OutputFormat {
   
/*
    Here is the code for exporting the pdf by using the inbuilt functions.
    */

        @Override
	public void toExport(Alien alien) throws DocumentException {
		
           
			String fileName = alien.getCodeName()+ ".pdf";
			Document doc = null;
			try {
				doc = new Document();
                                FileOutputStream file= new FileOutputStream(fileName);
				PdfWriter.getInstance(doc,file );
				doc.open();
				Paragraph p = new Paragraph();
				List<String> data = alien.convertIntoList();
				for (String line : data) {
					p.add(line +"\n");
				}
				doc.add(p);
				System.out.println("Process Completed in pdf.");
			} 
                        catch (FileNotFoundException | DocumentException e) {
                            System.out.println(e);
			}
                        finally {
				if (null != doc) {
					doc.close();
				}
			}
		}
	}

