package PART26.com.java.programs.CountOccurancesOfCharactersInString;

public class OccurancesOfCharacter 
{
   public static void main(String[] args) {
	
	String s="Java Programming Language"; //Here count howmany times a is present
    
	int total_count=s.length();
	int totalcount_afterremovea=s.replaceAll("a","").length();
	int count=total_count - totalcount_afterremovea;
	System.out.println("Number of occurance a is "+count); 
   }
}
