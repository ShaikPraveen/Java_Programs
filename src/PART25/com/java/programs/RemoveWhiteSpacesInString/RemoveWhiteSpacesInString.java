package PART25.com.java.programs.RemoveWhiteSpacesInString;

public class RemoveWhiteSpacesInString 
{
	public static void main(String[] args)
	{
		String s="Java programming Language Learning";
		System.out.println("Before removing white spaces "+s);
		s=s.replaceAll("\\s", ""); //s spaces
	    System.out.println("After removing white spaces "+s);
	}

}
