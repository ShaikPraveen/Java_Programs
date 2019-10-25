package PART18.com.java.programs.FindMissingNumberInArray;

public class FindMissingNumberInArray 
{
	public static void main(String[] args) 
	{
		//Array should not have duplicates
		//Array no need to be sorted order
		//Values should be proper range
		
		int a[]={1,2,3,4,6};
		//1 + 2 + 3 + 4 + 6 = 16 ->  sum1
		//1 + 2 + 3 + 4 + 5 + 6 =21 -> sum2
		// sum2-sum1=21-16=5
		
		int sum1=0;
		int sum2=0;
		
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("SUM OF ELEMENTS IN ARRAY IS "+sum1);
		
		for (int i = 1; i <=6; i++) {
			sum2=sum2+i;
		}
		System.out.println("SUM OF RANGE ELEMENTS IN ARRAY IS "+sum2);
		System.out.println("MISSING NUMBER IN ARRAY IS "+(sum2-sum1));
	}
}
