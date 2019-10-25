package PART07.com.java.programs.CountEvenAndOddInNumber;

public class CountEvenAndOddInNumber 
{
	public static void main(String[] args)
	{
	     int num=7986123;
	     int event_count=0;
	     int odd_count=0;
	     
	     while(num>0)
	     {
	    	 int rem=num % 10;
	    	 if (rem % 2==0)
	    	  {
				    event_count++;
			} else 
			{
             odd_count++;
			}
	    	 num=num/10;
	     }
	     
	     System.out.println("NUMBER OF EVEN NUMBERS ARE =>"+event_count);
	     System.out.println("NUMBER OF ODD NUMBERS ARE =>"+odd_count);
	}

}
