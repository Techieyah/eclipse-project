package examples.a3;
public class MainClass {
	//Create a manager class
	//in manager class create 3 instance variables namely
	//1. name of type string
	//2. city of type string
	//3. age of type int
	//create a object of manager class in main method
	//give the values to the object and
	//show the string value of object in sysout
	public static void main(String[] args) {
		
		Manager myManager = new Manager();
		myManager.setName("Aparna");
		myManager.setCity("Mysuru");
		myManager.setage(23);
	      System.out.println(myManager.getName());
	      System.out.println(myManager.getCity());
	      System.out.println(myManager.getAge());
		}

	}



