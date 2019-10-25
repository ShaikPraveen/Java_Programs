package PART30.com.java.programs.WriteDataIntoTextFile;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
   
	public static void main(String[] args) throws IOException 
	{
	 
		FileWriter fw=new FileWriter("E:\\SELENIUM\\Test123.txt");
		
		BufferedWriter br=new BufferedWriter(fw);
		
	
		
		br.write("Welocome To Java");
		br.newLine();
		br.write("Welocome To Selenium");
		br.newLine();
		br.write("Welocome To Java Programming");
		br.newLine();
		
		System.out.println("Finished!!!!!");
		
		br.close();
		
		
}
}
