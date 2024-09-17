package interfaceConcept.multiple.examples.a1;

public class Zomato implements MeghanaFoods,A2B{

	@Override
	public void deliverFromA2B() {
		System.out.println("Zomato deliered food from A2b");
		
	}

	@Override
	public void deliverFromMeghanaFoods() {
		System.out.println("Zomato delivered food from MeghanaFoods");
		
	}

}
