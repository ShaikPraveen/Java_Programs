package PART02.com.java.programs.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) {
	/*	//Reverse number means, reverse of a given number 
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER A NUMBER");
		int num=sc.nextInt();
		
		//1. Logic1 - Using Logic
		int rev=0;
		while(num !=0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		
		//2.Logic2 - Using StringBuffer Class
		StringBuffer sb=new StringBuffer(String.valueOf(num));//Converting Integer to String
		StringBuffer rev=sb.reverse();
		
		//2.Logic3 - Using StringBuilder Class
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		
		System.out.println("REVERSE OF A GIVEN NUMBER IS => "+rev);*/
		
		
		
		String r="786";
		StringBuilder  sb= new StringBuilder(r);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
	}

}
