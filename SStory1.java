package story1;

import java.util.HashMap;

public class SStory1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="If we write a program and compile if, then As we can run the program to get and$";  
		
		System.out.println(SyntaxHighlighter((s1.split("\\s"))));
		 
	}

	public static String SyntaxHighlighter(String[] s1) {
	ColourAdder color=new ColourAdder();
	
		
		return color.addcolour(s1);
		
	}
	

}



