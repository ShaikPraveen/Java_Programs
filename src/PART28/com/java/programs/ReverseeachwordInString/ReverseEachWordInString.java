package PART28.com.java.programs.ReverseeachwordInString;

public class ReverseEachWordInString
{
   public static void main(String[] args)
   {
	 
	      //Approach-1
	      /*String str="Welcome To Java Praveen"; 
	      String[] a=str.split(" ");
	      
	      String reversestring="";
	      
	      for(String words : a)
	      {
	    	  String reverseword="";
	    	  
	    	  for (int i = words.length()-1; i>=0; i--)
	    	  {
	    		  reverseword=reverseword+words.charAt(i);
			}
	    	  
	    	  reversestring=reversestring+reverseword+" ";
	      }
	      
	      System.out.println(reversestring);*/
	   
	   //Approach-2
	   String str="Welcome To Java praveen"; 
	   
	   String[] words=str.split("\\s");
	   
	   String reverseword="";
	   
	   for(String w:words)
	   {
		   StringBuilder sb=new StringBuilder(w);
		   sb.reverse();
		   reverseword=reverseword+sb.toString()+" ";
	   }
	   
	   System.out.println(reverseword);
}
}
