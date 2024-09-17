package basics.ch_10_if_and_else;

import java.util.Scanner;

//Class object = new Class();
//object.method()

public class IfAndElseTask {

	public static void main(String[] args) {
		/*
		 * Print "CHILD" IF AGE is more than 0 less than  or equal to 12
		 * print "TEEN" if age more than 12 but less than or equal to 17
		 * print "ADULT" if age is more than 17 but less than or equal 50
		 * print "SENIOR"  if age is more than 50 but less than or equal to 127
		 * print "ENTER THE VALUES BETWEEN 1 AND 127 "for  all other values
		 */
		
		int age ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age");
		age = scanner. nextInt();
		
		if(age >=0 && age<12) {
			System.out.println("CHILD");
		} else if(age >=12 && age<18) {
			System.out.println("TEEN");
		} else if(age >=12 && age<18) {
			System.out.println("ADULT");
		} else if(age >=50 && age<127) {
			System.out.println("SENIOR");
		}

	}

}
