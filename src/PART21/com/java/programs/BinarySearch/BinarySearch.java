package PART21.com.java.programs.BinarySearch;

import java.util.Arrays;

public class BinarySearch 
{
   public static void main(String[] args) {
	
	   int a[]={1,2,3,4,5,6,7,8,9,10};//should be in sorted order, But in Linear search not required
	   System.out.println(Arrays.binarySearch(a, 8));
	   
	   //Output: 7 
	   //Means in 7th position 8 is there in array
}
}
