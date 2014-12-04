/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliencode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * The main method.
	 * 
	 * @param argv
	 *            the arguments
	 */
	public static void main(String[] argv) {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter the Details of an alien");
		Alien alien = new Alien();

		try {
			// get alien data from user
			System.out.println("Code Name:");
			alien.setCodeName(bufferedReader.readLine());
			System.out.println("Blood Color");
			alien.setBloodColor(bufferedReader.readLine());
			System.out.println("Home Planet:");
			alien.setHomePlanet(bufferedReader.readLine());
			System.out.println("No of Antennas:");
			alien.setNoOfAntenna(Integer.parseInt(bufferedReader.readLine()));
			System.out.println("No of Legs:");
			alien.setNoOfLegs(Integer.parseInt(bufferedReader.readLine()));
                        //Get Format for exportingFile dir = new File("put path to classes you want to load here");
                                    
			System.out.println("Enter Export format");
			theReader();
                        System.out.println("Any Other number will be considered as Exit point");
			int userInput=0;//Default is text
			String input;
			boolean flag = true;
			
                        while(flag)
                        {
                            input=bufferedReader.readLine();
                            if(isNumber(input))
                            {
                                userInput=Integer.parseInt(input);
                                flag=false;
                            }
                            else
                            {   //If the code of export format entered is wrong
                                System.out.println("bad Input!! Try Again");
                                flag=true;
                            }
                        }
                       new ChooseFormat().chooseFormat(userInput,alien);
		} 
                catch (IOException e) {
			System.out.println(e);
		}
                catch(Exception e)
                {
                    System.out.println(e);
                }

	}
        
	private static boolean isNumber(String s) {
		if (null != s) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException n) {
				return false;
			}
			return true;
		}
		return false;
	}
        private static void theReader()throws Exception
        {
            FileReader fr= new FileReader("FormatNames.txt");
            int flag=0;
                        BufferedReader br=new BufferedReader(fr);
                        while(true)
                                {
                                    try
                                    {
                                        String s=br.readLine();
                                        if(s!=null)
                                        System.out.println(s);
                                        else
                                            break;
                                    }
                                    catch(Exception e )
                                    {
                                        flag=1;
                                    }
                                    if (flag==1)
                                        break;
                                }
        }
}
