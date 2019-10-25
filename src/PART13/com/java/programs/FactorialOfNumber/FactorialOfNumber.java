package PART13.com.java.programs.FactorialOfNumber;

//5! = 1 * 2 * 3 * 4 * 5 = 120
//5! = 5 * 4 * 3 * 2 * 1 = 120
public class FactorialOfNumber 
{
	public static void main(String[] args) {
		
		int num=5;
		long factorial=1;
	
	    //Using descending order 	
		/*for (int i = 1; i <=num; i++)
		{
		   factorial=factorial * i;	
		}
		System.out.println("FACTORIAL OF NUMBER IS "+factorial);*/
		
		 //Using ascending order 	
		for (int i = num; i>=1; i--)
		{
		   factorial=factorial * i;	
		}
		System.out.println("FACTORIAL OF NUMBER IS "+factorial);
	}
}
