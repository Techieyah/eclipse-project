package basics.ch_13_break;

public class BreakWithWhileLoop {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		// after printing 4 terminate the loop
		int counter = 1;
		while(counter < 11) {
			System.out.println(counter);
			counter++;
			
			if(counter == 6) {
				break;
			}
		}

	}

}
