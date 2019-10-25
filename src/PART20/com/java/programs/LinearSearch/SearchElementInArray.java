package PART20.com.java.programs.LinearSearch;

public class SearchElementInArray 
{
   public static void main(String[] args)
   {
	   int a[]={10,20,30,50,40};
	   
	   int search_element=50;
	   
	   boolean flag=false;
	   for (int i = 0; i < a.length; i++) 
	   {
		   if (search_element==a[i])
		   {
			  System.out.println("FOUND ELEMENT AT: "+i +" POSITION");
			  flag=true;
			  break;
		}
	}
	   if (flag==false)
	   {
		   System.out.println("ELEMENT  NOT FOUND");
	}
}
}
