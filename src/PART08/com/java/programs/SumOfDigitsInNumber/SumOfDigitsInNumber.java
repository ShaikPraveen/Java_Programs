package PART08.com.java.programs.SumOfDigitsInNumber;

public class SumOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
	   int num=1254456;
	   int sum=0;
	   
	   while(num > 0)
	   {
		   sum=sum+num % 10;
		   num=num/10;
	   }
	   System.out.println("SUM OF GIVEN NUMBER IS =>"+sum);
	}
}
