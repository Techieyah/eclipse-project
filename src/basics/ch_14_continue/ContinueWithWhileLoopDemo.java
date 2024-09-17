package basics.ch_14_continue;

public class ContinueWithWhileLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 20 except 15
		int counter = 1;
		while(counter<21) {
			if(counter ==15) {
				counter++;
				//System.out.println(counter);
				continue;
			}
				System.out.println(counter);
				counter++;
			}
		}

	}


