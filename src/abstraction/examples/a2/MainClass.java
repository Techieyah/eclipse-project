package abstraction.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		Pen pen;
		
		pen = new Black();
		pen.ink();
		
		pen = new Blue();
		pen.ink();
	
	}

}
