package basics.ch_13_break;

public class BreakWithForLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10\
		// after printing 5 terminate the loop
		for (int counter = 1; counter < 11;) {
			System.out.println(counter);
			counter++;
			if (counter == 6) {
				break;
			}
		}

	}

}