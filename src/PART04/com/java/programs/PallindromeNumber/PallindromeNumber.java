package PART04.com.java.programs.PallindromeNumber;

import java.util.Scanner;

public class PallindromeNumber
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num=sc.nextInt();
		int rev=0;
		int original_num=num;
		
		while(num!=0)
		{
			rev=rev*10 + num %10;
			num=num/10;
		}
		
		if (original_num == rev)
		{
		   System.out.println("GIVEN NUMBER IS PALLINDROME NUMBER");	
		} else {
			System.out.println("GIVEN NUMBER IS NOT PALLINDROME NUMBER");
		}
	}
}
