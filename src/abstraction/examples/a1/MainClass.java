package abstraction.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		Zomato zomato;
		
		zomato = new GooglePay();
		zomato.payment();
		zomato.display();
		
		zomato=new Phonepe();
		zomato.payment();
		zomato.display();
		}
		
}
