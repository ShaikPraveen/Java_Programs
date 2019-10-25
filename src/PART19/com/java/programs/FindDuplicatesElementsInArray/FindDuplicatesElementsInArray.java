package PART19.com.java.programs.FindDuplicatesElementsInArray;

import java.util.HashSet;

public class FindDuplicatesElementsInArray
{
	public static void main(String[] args) 
	{
		//Approach-1
	    //String arr[]={"selenium","Java","testing","java","selenium"};  
	    /*boolean flag=false;
	    for (int i = 0; i < arr.length; i++)
	    {
		    for (int j = i+1; j < arr.length; j++)
		    {
			     if (arr[i]==arr[j])
			     {
					System.out.println("FOUND DUPLICATE ELEMENT:"+arr[i]);
					flag=true;
				}	
			}	
		}
	    if (flag==false)
	    {
		    System.out.println("DUPLICATE ELEMENT NOT FOUND");	
		}*/
	    
	    //Approach-2 using HashSet
	    //HashSet will not allow you add duplicates
	    //Below HashSet Example
	    /*HashSet<String> langs=new HashSet<String>();
	    System.out.println(langs.add("selenium"));
	    System.out.println(langs.add("java"));
	    System.out.println(langs.add("selenium"));*/
	    
	    
	    String arr[]={"selenium","java","testing","java","selenium"};
	    HashSet<String> langs=new HashSet<String>();
	    
	    boolean flag=false;
	    for(String l:arr)
	    {
	    	if(langs.add(l)==false)
	    	{
	    		System.out.println("FOUND DUPLICATE ELEMENT:"+l);
	    		flag=true;
	    	}
	    }
	    if (flag==false) {
	    	System.out.println("DUPLICATE ELEMENT NOT FOUND");
		} 
	}
}
