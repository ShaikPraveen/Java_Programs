package PART01.com.java.program.Swapping;

public class Swapping
{
	public static void main(String[] args) {
		//Swapping means interchanging the values
		
		//1.Logic-1 using Third Variable
		    int a=10;
		    int b=20;
		    System.out.println("BEFORE SWAPPING  a and b VALUES ARE => "+a +" "+b);
		    
		    /*int k;
		    k=a;
		    a=b;
		    b=k;*/
		    
     //2.Logic-2 without using Third Variable
		   
		   /*a=a+b;
		     b=a-b;
		     a=a-b;*/
		     
    //3.Logic-3 using * and / operators (here the values should not be zeros)
		   /*a=a*b;
		     b=a/b;
		     a=a/b;*/
   //4.Logic-4 using Bitwise XOR(^) operator
		     
		     /*a=a ^ b;
		     b=a ^ b;
		     a=a ^ b;*/
		     
   //5.Logic-5 using Single statement
		    
		    b= a+b-(a=b);
		    
		    System.out.println("AFTER SWAPPING a and b VALUES ARE => "+a +" "+b);   
	}
}
