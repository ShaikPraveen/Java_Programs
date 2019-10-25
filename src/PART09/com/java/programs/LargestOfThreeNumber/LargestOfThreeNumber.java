package PART09.com.java.programs.LargestOfThreeNumber;

import java.util.Scanner;

public class LargestOfThreeNumber 
{
   public static void main(String[] args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER A VALUE");
	 int a=sc.nextInt();
	 
	 System.out.println("ENTER B VALUE");
	 int b=sc.nextInt();
	 
	 System.out.println("ENTER C VALUE");
	 int c=sc.nextInt();
	 
	    /*if (a>b && a>c) 
	    {
		  System.out.println(a +" IS LARGEST NUMBER");	
		}else if (b>a && b>c)
		{
			System.out.println(b +" IS LARGEST NUMBER");
		}else
		{
			System.out.println(c +" IS LARGEST NUMBER");
		}*/
	    
	  //2. Using Ternary operator
	  //int largest=a>b?a:b;
	  //int largest1=c>largest?c:largest;
	  //System.out.println(largest1+" IS LARGEST NUMBER");   
	  
	  int largest1=c>(a>b?a:b)?c:a>b?a:b;
	  System.out.println(largest1+" IS LARGEST NUMBER");  
} 
}
