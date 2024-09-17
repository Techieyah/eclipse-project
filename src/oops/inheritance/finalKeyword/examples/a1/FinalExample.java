package oops.inheritance.finalKeyword.examples.a1;

public class FinalExample {

	public static void main(String[] args) {
	Dog myDog = new Dog();
	myDog.eat();
	myDog.sound();
	
	final Dog yourDog;
	yourDog = new Dog();
	
	}

}
