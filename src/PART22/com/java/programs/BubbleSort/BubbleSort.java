package PART22.com.java.programs.BubbleSort;

import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) {
		
    	int a[]={4,2,1,5,3};
    	
    	System.out.println("Array Before Sorting Is "+Arrays.toString(a));//It will print all values in Array
	   
    	 int n=a.length;
    	 
    	 for (int i = 0; i<n-1; i++) //This for loop is for number of passes
    	 {
    		 for (int j =0; j<n-1; j++)  //This is for loop if for comparing two elements and swapping those elements
    		 {
    			  if (a[j]>a[j+1])
    			  {
					   int temp=a[j];
					   a[j]=a[j+1];
					   a[j+1]=temp;
				}
			}
		}
    	 System.out.println("Array After Sorting Is "+Arrays.toString(a));
    }
}
