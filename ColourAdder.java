package story1;

public class ColourAdder {
	private String colour(String[] s1) {
		 StringBuilder builder = new StringBuilder();
		 for(String w:s1){  
			 Checker c=new Checker();
			 String c1=c.ConditionCheck(w);
				char  l=w.charAt(w.length()-1);
				String last=Character.toString(l);
				System.out.println(last.matches("[A-Za-z]"));
				if( c1!= null)  {
					
					
					builder.append(c1);
				
					if(!(last.matches("[A-Za-z]"))) {
						builder.append(w.substring(0, w.length()-1));
						builder.append(c1);
						builder.append(w.charAt(w.length()-1));
					}else {
					builder.append(w);
					builder.append(c1);
					}
					builder.append("\s");
					
					
				}else {
					builder.append(w);
					if(!(w.endsWith(",")||w.endsWith("."))) {
						builder.append("\s");
					}
				}
				
				}
		 String singleString = builder.toString();
		 return singleString;
	}
	public  String addcolour(String[] s1) {
		return colour(s1);
		
	}

}
