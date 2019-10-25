package PART29.com.java.programs.ReadDataFromTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile
{
   public static void main(String[] args) throws IOException
   {
	   //Approach-1 using FileReader and BufferedReader
	   /*FileReader fr=new FileReader("E:\\SELENIUM\\Test.txt");
	   BufferedReader br=new BufferedReader(fr);
	   
	   String str;
	   
	   while((str=br.readLine())!=null)
	   {
		   System.out.println(str);
	   }
	   br.close();*/
	   
	 //Approach-2 using Scanner and File
	   /*File f=new File("E:\\SELENIUM\\Test.txt");
	   
	   Scanner sc=new Scanner(f);
	   
	   while (sc.hasNextLine())//is conditional command, it will returns true or false
	   {
		System.out.println(sc.nextLine());//read content from the file
	   }
	   */
	 //Approach-3 using useDelimeter
       File f=new File("E:\\SELENIUM\\Test.txt");
	   Scanner sc=new Scanner(f);
	   
	   sc.useDelimiter("\\Z");
	   System.out.println(sc.next());
}
}
