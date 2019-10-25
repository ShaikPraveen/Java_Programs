package PART05.com.java.programs.PallindromeString;

import java.util.Scanner;

public class PallindromeString
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String str=sc.next();
	
		String rev="";
		String original_str=str;
		
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if (original_str.equals(rev))
		{
			System.out.println("GIVEN STRING IS PALLINDROME STRING");
		} else {
			System.out.println("GIVEN STRING IS NOT PALLINDROME STRING");
		}
	}

}
