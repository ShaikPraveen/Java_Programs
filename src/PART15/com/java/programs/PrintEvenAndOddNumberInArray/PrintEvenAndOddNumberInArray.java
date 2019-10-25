package PART15.com.java.programs.PrintEvenAndOddNumberInArray;

public class PrintEvenAndOddNumberInArray 
{
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
		
		/*System.out.println("EVEN NUMBERS ARE");
		for(int i=0; i<a.length; i++)
		{
			if (a[i]%2==0) 
			{
				 System.out.println(a[i]);
			}
		}*/
		
		/*System.out.println("ODD NUMBERS ARE");
		for(int i=0; i<a.length; i++)
		{
			if (a[i]%2!=0) 
			{
				 System.out.println(a[i]);
			}
		}*/
		
		//Eanhanced for loop
		System.out.println("EVEN NUMBERS ARE");
		for(int value : a)
		{
			if (value%2==0) 
			{
			    System.out.println(value);	
			}
		}
		
		
		System.out.println("ODD NUMBERS ARE");
		for(int value : a)
		{
			if (value%2!=0) 
			{
			    System.out.println(value);	
			}
		}
		
	}

}
