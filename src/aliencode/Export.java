/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliencode;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Shivansh
 */
public class Export {
   
/*
    Here is the code for exporting the pdf by using the inbuilt functions.
    */

	public static void pdfFormat(Alien alien) throws DocumentException {
		
           
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
				System.out.println("Process Completed.");
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
/*
        Here is the code for making the fle in text format. 
        */
    public static void textFormat(Alien alien) throws IOException {
		if (alien!=null) {
			BufferedWriter out = null;
			try {
				String fileName = alien.getCodeName()+".text";
				FileWriter saveFile = new FileWriter(fileName);
				out = new BufferedWriter(saveFile);
				List<String> data = alien.convertIntoList();
				for (String line : data) {
					out.write(line +"\n");
				}

				System.out.println("Process Completed");
			} 
                        catch (IOException e) {
				System.out.println(e);
			} 
                        finally {
                            out.close();
				}
			}
		}
	}

