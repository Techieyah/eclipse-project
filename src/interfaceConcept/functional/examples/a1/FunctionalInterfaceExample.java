package interfaceConcept.functional.examples.a1;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal cat;
		cat=new Animal();
		
		@Override
		public void sound() {
			System.out.println("Meow Meow");
		}
	};
	
	cat.sound();

	Animal dog;
	dog=new Animal() {
		@Override
		public void sound() {
			System.out.println("bow bow");
		}
		};
		dog.sound();
	}

}
