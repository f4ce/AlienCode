/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package export.format;

import aliencode.Alien;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Shivansh
 */
public class TextOutput extends OutputFormat{
    
       /* Here is the code for making the fle in text format. 
        */
    @Override
    public void toExport(Alien alien) throws IOException {
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

				System.out.println("Process Completed in text");
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
