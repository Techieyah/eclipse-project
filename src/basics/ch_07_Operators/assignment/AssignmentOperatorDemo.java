package basics.ch_07_Operators.assignment;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		//Assignment Operators
		//"=" assigns value from right side to left side
		int a=1;
		System.out.println(a);
		// "++" for increment operator
		//it will increase the value by 1
		//a=a+1; // shorthand a++;
		a++;
	
		System.out.println(a);
		
		// "--" for decrement operator
		// it will decrease the value by 1
		//a=a-1;
		a--;
		System.out.println(a);
		
		//increase the value by 3
		//a=a+3; //shorthand a += 3
		a += 3;
		System.out.println(a);
		
		//decrease the value by 3
		//a = a-3; //shorthand a -= 3;
		a -= 3;
		System.out.println(a);
		
		//multiply the value of 2
		//a = a*2;//shorthand a*=2;
		a*=2;
		System.out.println(a);
		
		//divide the value by 2
		//a=a/2; //shorthand a/=2;
		a/=2;
		System.out.println(a);
		
		//modulus the value by 2
		int b=9;
		//b=b%2; //Shorthand b %= 2;
		b %= 2;
		System.out.println(b);
	}

}
