package story1;
import java.util.HashMap;
public class Checker {
	private static HashMap<String, String> hm = new HashMap<String, String>();
	 static {
	 hm.put("as", "[blue]");
       hm.put("if", "[blue]");
       hm.put("and", "[blue]");
       hm.put("then", "[blue]");
       hm.put("when", "[blue]");
	 }
       
	private  String checker(String s1) {
		char  l=s1.charAt(s1.length()-1);
		String last=Character.toString(l);
		String s2[]= {"as","if","and","then","when" };
		if(!(last.matches("[A-Za-z]"))) {
			s1=s1.substring(0, s1.length()-1);
			
		}
		return hm.get(s1.toLowerCase());
		
		
	}
	public String ConditionCheck(String s1) {
		return checker(s1);
	}

}
