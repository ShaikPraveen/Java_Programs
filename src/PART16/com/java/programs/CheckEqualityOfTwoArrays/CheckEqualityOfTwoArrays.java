package PART16.com.java.programs.CheckEqualityOfTwoArrays;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays
{
	public static void main(String[] args) {
		
		int a1[]={1,2,3,4,5,6};
		int a2[]={1,2,3,4,5,6,7};
		
	    //Using Arrays Class
	/*	boolean status=Arrays.equals(a1, a2);//It will returns true or false
		if (status==true) 
		{
		   System.out.println("ARRAYS ARE EQUAL");	
		}else
		{
			System.out.println("ARRAYS ARE NOT EQUAL");	
		}*/
		
		
		
		//Using Logic
		
		boolean status=true;
		
		if (a1.length == a2.length)
		{
		   	for (int i = 0; i < a1.length; i++) 
		   	{
			   if (a1[i]!=a2[i])
			   {
				  status=false;
			}	
			}
		}else
		{
			status=false;
		}
		if (status==true) {
			System.out.println("ARRAYS ARE EQUAL");
		} else {
			System.out.println("ARRAYS ARE NOT EQUAL");
		}
	}

}
