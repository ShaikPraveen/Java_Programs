package PART11.com.java.programs.PrimeNumberOrNot;

public class PrimeNumberOrNot 
{
   public static void main(String[] args)
   {
	
	     int num=2;
	     int count=0;
	     
	     if (num > 1) 
	     {
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				count++;
			}if (count==2) 
			{
			   System.out.println(num+" PRIME NUMBER");	
			} else
			{
              System.out.println(num+" NOT PRIME NUMBER");
			}
		}else
		{
			System.out.println(num+" NOT A PRIME NUMBER");
		}
}
}
