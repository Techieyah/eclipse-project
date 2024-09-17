package basics.ch_07_Operators.ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// Ternary Operator -- ?
		
			System.out.println(true ? "java" : "python"); //java
			System.out.println(false ? "java" : "python");//python
			
			System.out.println(true ? 5:10); //5
			System.out.println(false ? 5:10); //10
			
			String subject;
			subject = true ? "sql" : "machine learning";
			System.out.println(subject); //sql
			
			subject = false ? "sql" : "machine learning";
			System.out.println(subject);
			
			char character;
			subject = true ? "sql" : "machine learning";
			System.out.println(subject); //sql
			subject = false ? "sql" : "machine learning";
			System.out.println(subject);
	
			byte byteNumber;
			byteNumber = true ? 123 : 455;
			System.out.println(byteNumber); 
			byteNumber = false ? 455 : 123;
			System.out.println(byteNumber);
			
			short shortNumber;
			shortNumber = true ? 123 : 455;
			System.out.println(shortNumber); 
			shortNumber = false ? 455 : 123;
			System.out.println(shortNumber);
			
			int intNumber;
			intNumber = true ? 456 : 321;
			System.out.println(intNumber); 
			intNumber = false ? 455 : 123;
			System.out.println(intNumber);
			
			long longNumber;
			longNumber = true ? 456123L : 678321L;
			System.out.println(longNumber); 
			longNumber = false ? 453455L : 152739L;
			System.out.println(longNumber);
			
			float floatNumber;
			floatNumber = true ? 4.2345f : 67.5671f;
			System.out.println(floatNumber); 
			floatNumber = false ? 4.53455f : 15.2739f;
			System.out.println(floatNumber);
			
			double doubleNumber;
		    doubleNumber = true ? 4345 : 65671;
			System.out.println(doubleNumber); 
			doubleNumber = false ? 44455 : 1534;
			System.out.println(doubleNumber);
			
			boolean isTrueOrFalse;
			isTrueOrFalse = true ? false : true;
			System.out.println(isTrueOrFalse);
			
			isTrueOrFalse = false ? false : true;
			System.out.println(isTrueOrFalse);
			
			

	}

}
