package PART24.com.java.programs.RemoveJunkAndSpecialCharactersInString;

public class RemoveJunkSpecialCharactersInString 
{
	public static void main(String[] args) {
		
		String s="!!@##%^%$!@(*&^()*&^%#! latin string 2436275672";
		
		String s1="!!@##%^%$ selenium !@(*&^()*&^%#! testing ###@!@&%% java *&^%$#^ manual";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
