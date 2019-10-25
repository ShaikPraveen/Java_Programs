package PART14.com.java.programs.SumOfElementsInArray;

public class SumOfElementsInArray 
{
	public static void main(String[] args) {
		
		 int a[] ={1,2,3,5,7};
		 int sum=0;
		 
		 /*for(int i=0; i<=a.length-1; i++)
		 {
			 sum=sum+a[i];
		 }*/
		 
		 //Using Enhanced for loop
		 for(int value : a)
		 {
			 sum=sum+value;
		 }
		 System.out.println("SUM OF ARRAY ELEMENTS ARE "+sum);
	}
}
