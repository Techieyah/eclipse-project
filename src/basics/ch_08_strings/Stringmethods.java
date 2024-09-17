package basics.ch_08_strings;

public class Stringmethods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String subjects = "java";
		String subject = new String("java");
		System.out.println(subject);
		String text;
		//touppercase()
		// coverts a string to upper case
		// returns a string converted to uppercase
		text =subject.toUpperCase();
		System.out.println(subject);
		System.out.println(text);
		
		text = subject.toLowerCase();
		System.out.println(text);
		
		
		boolean isTrueorFalse;
		//contains("value")
		// check whether a strig contains a squence of chaeacters
		// return true or false 
	    isTrueorFalse = subject.contains("j");
	    System.out.println(isTrueorFalse);
	    
	    
	    
	    isTrueorFalse = "Java".equals("java");
	    System.out.println(isTrueorFalse);
	    
	    isTrueorFalse = "java".equals("java");
	    System.out.println(isTrueorFalse);
	    
	    // equalsignorecase()
	    // compares two strings , ignors case consideration
	    // returns true if the string are equal, and false it not
	    isTrueorFalse = "SQL".equalsIgnoreCase("sql");
	    System.out.println(isTrueorFalse);
	    
	    // replaceAll("oldText","newText")
	    subject.replaceAll(subject, "ma");
	    System.out.println(text);
	    System.out.println(subject);
	     
	    int index;
	    // indexof ('characters')
	    // returns the index or position of the first found occurrence of
	    // the specified characters in a string
	    // returns -1 if the character is not found
	    index = subject.indexOf('J');
	    System.out.println(index);
	    
	    index = subject.indexOf("as");
	    System.out.println(index);
	    char character;
	    //charAt(index)
	    // returns the charater values at the specified index or position
	    character = subject.charAt(2);
	    System.out.println(character);
	    
	    int size;
	    // length()
	    // returns the length of a specified string
	    // returns the total count of charaters in the specified string
	    size = subject.length();
	    System.out.println(size);
	    
	    isTrueorFalse = " ".isEmpty();
	    System.out.println(isTrueorFalse);
	    
	    //lastIndexOf('character')
	    // returns the position or index of last found occurrence of
	    // specified character in a string
	    // returns -1 if the character is not found
	    index = subject.lastIndexOf('a');
	    System.out.println(index);
	    
	    isTrueorFalse = subject.endsWith("va");
	    System.out.println(isTrueorFalse);
	    
	    isTrueorFalse = subject.startsWith("ja");
	    System.out.println(isTrueorFalse);
	    
	    //trim()
	    // remove whitespace from both ends of a string
	    // returns the resulting string
	    text = "        sun shine      ".trim();
	    System.out.println(text);
	    
	    //isblank()
	    // returns true if the string is blank
	    // or contains only white space otherwise , false
	    isTrueorFalse = "  ".isBlank();
	    System.out.println(isTrueorFalse);
	    
	    
	    
	    
	    
	    
	    
	    
	}	    
}