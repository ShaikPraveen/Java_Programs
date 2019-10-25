package PART17.com.java.programs.FindMaximumAndMiniumumInArray;

public class FindMaximumAndMiniumumInArray
{
	public static void main(String[] args) {
		
		int a[]={50,60,70,20,40,66,2,0,-1,1};
		
		/*int max=a[0];
		for (int i = 1; i < a.length; i++)
		{
		    if (a[i]>max) 
		    {
			    max=a[i];
			    
			}		   
		}
		 System.out.println("MAXIMUM ELEMENT IN ARRAY IS "+max);*/	
		
		int min=a[0];
		for (int i =1; i < a.length; i++)
		{
			if (a[i]<min) 
			{
			   min=a[i];	
			}
		}
		System.out.println("MINIMUM ELEMENT IN ARRAY IS "+min);
	}

}
