package basics.ch_08_strings;

public class StringConcatenation {

	public static void main(String[] args) {
		// joining or combining  character or string is 
				// referred as concatenation
				
				// joining String + String ==> String
				System.out.println("sun"+ "shine");// sunshine
				
				System.out.println("java"+10);// java10
				
				// 14 => "14"
				String numberText = 14+"";
				System.out.println(numberText);
				
				String subject = "java";
				String text = subject + " " +10;
				System.out.println(text);
				//concat()
				System.out.println("java".concat("programming"));
				System.out.println(subject.concat("programming"));
			       System.out.println("java".concat("  programming"));
			       System.out.println("java".concat(" " + "Programing"));
			       
			       text="programming";
			       String course= subject + " : " + text;
			       System.out.println(course); //java:programming
			       System.out.println(subject.concat(" " +text)); //java programming
	}

}
