package oops.polymorphism.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Employee rakshitha = new Employee();
		rakshitha.name ="Rakshitha";
		
		Manager srinath = new Manager();
		srinath.name ="Srinath";
		
		Clerk aparna = new Clerk();
		aparna.name ="Aparna";
		
		printEmployee(rakshitha);
		//printEmployee(srinath);
		//printEmployee(aparna);

		printManager(srinath);
		//printManager(aparna);

		
		printClerk(aparna);
		//printClerk(rakshitha);

	}
	public static void printEmployee(Employee emp) {
		System.out.println(emp.name);
	}
	public static void printManager(Manager mgr) {
		System.out.println(mgr.name);
	}
	
	public static void printClerk(Clerk ck) {
		System.out.println(ck.name);
	}
	
}
