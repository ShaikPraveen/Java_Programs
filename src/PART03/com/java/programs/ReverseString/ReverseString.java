package PART03.com.java.programs.ReverseString;

public class ReverseString 
{
	public static void main(String[] args)
	{
		//Reverse string means reverse of a given string
		//1. Logic1 Using String Concatination (+) Operator
		
		String str="ABCD";
		String rev="";
		
		/*int len=str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
		//2. Using Char Array
		
		/*char a[] =str.toCharArray();//Converting string char array
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		
		//3. Using StringBuffer Class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sbr=sb.reverse();
		System.out.println(sbr);
	}

}
