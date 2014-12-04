/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliencode;
import export.format.*;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Shivansh
 */
public class ChooseFormat {
    
    public void chooseFormat(int choice, Alien alien) throws Exception
    {
        OutputFormat format;
        int flag=0;
          FileReader filereader= new FileReader("FormatNames.txt");
                        BufferedReader bufferedreader=new BufferedReader(filereader);
                        while(true)
                                {
                                    try
                                    {
                                      String formattypes=bufferedreader.readLine();
                                      if(Integer.parseInt(formattypes.substring(0,formattypes.indexOf(':')))==choice)
                                      {
                                          flag=1;
                                          Class classes=Class.forName("export.format."+formattypes.substring((formattypes.indexOf(':')+1)));
                                          Object obj=classes.newInstance();
                                          format=(OutputFormat)obj;
                                          format.toExport(alien);
                                      }
                                      if(flag==1)
                                      {
                                          break;
                                      }
                                    }
                                    catch(ClassNotFoundException cf)
                                    {
                                    System.out.println("no such output format is present");
                                    filereader.close();
                                    bufferedreader.close();
                                    break;
                                    }
                                    catch(Exception any)
                                    {
                                        filereader.close();
                                        bufferedreader.close();
                                        break;
                                    }
                                    
                                }

    }
   /*
    public ChooseFormat() throws ClassNotFoundException, MalformedURLException, IOException
    {
        super();
       Reflections reflections = new Reflections("export.format");
       Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
       Iterator i=allClasses.iterator();
       FileWriter fw=new FileWriter("FormatNames.txt");
       BufferedWriter bw=new BufferedWriter(fw);
       while(i.hasNext())
       {
           String classnames=i.next().toString();
           bw.write(classnames);
           
       }
       bw.close();
       fw.close();
    }
    */
}
