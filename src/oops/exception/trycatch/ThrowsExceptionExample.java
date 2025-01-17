package oops.exception.trycatch;

public class ThrowsExceptionExample {

	public static void main(String[] args) throws Exception{
		fun();
		
		System.out.println("program is going to sleep now");
		Thread.sleep(3000);
		System.out.println("Program awake now");
	

	}
	
	public static void fun() {
		try {
		throw new NullPointerException("some fun");
		
	}catch(NullPointerException e) {
		System.out.println("We are having fun");
		e.printStackTrace();
	}
		
	}
}
