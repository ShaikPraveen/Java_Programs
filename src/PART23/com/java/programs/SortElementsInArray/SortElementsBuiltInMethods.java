package PART23.com.java.programs.SortElementsInArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElementsBuiltInMethods
{
	public static void main(String[] args) {
		
		//int a[]={20,10,60,30,50,40,5,2,1};
		
		//Approac-1
	/*  System.out.println("Elements before sorting is "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Elements after sorting is "+Arrays.toString(a));*/
		
		 //Approac-2
		 /*System.out.println("Elements before sorting is "+Arrays.toString(a));
		 Arrays.sort(a);
		 System.out.println("Elements before sorting is "+Arrays.toString(a));*/
		
		//int -> This is primitive type
		//Integer ->This is derived type
		
		
		//Reverse Descending order
		 Integer a[]={20,10,60,30,50,40,5,2,1};
		 System.out.println("Elements before sorting is "+Arrays.toString(a));
		 Arrays.sort(a,Collections.reverseOrder());
		 System.out.println("Elements before sorting is "+Arrays.toString(a));
	}
}
