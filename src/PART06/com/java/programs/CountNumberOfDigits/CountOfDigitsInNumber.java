package PART06.com.java.programs.CountNumberOfDigits;

public class CountOfDigitsInNumber
{
	public static void main(String[] args) {
		
		int num=59876;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("NUMBER OF DIGITS IN A GIVEN NUMBER IS =>"+count);
	}

}
