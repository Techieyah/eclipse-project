package basics.ch_15_enum.enumWithSwitch;

import java.util.Scanner;

public class EnumWithSwitchDemo {

	public static void main(String[] args) {
		MonthEnum monthName;
		monthName = MonthEnum.AUGUST;
		
		switch (monthName) {
		case JANUARY:
			System.out.println(31);
			break;
		case FEBRAURY:
			System.out.println(28);
			break;
		case MARCH:
			System.out.println(31);
			break;
		case APRIL:
			System.out.println(30);
			break;
		case MAY:
			System.out.println(31);
			break;
		case JUNE:
			System.out.println(30);
			break;
		case JULY:
			System.out.println(31);
			break;
		case AUGUST:
			System.out.println(31);
			break;
		case SEPTEMBER:
			System.out.println(30);
			break;
		case OCTOBER:
			System.out.println(31);
			break;
		case NOVEMBER:
			System.out.println(30);
			break;
		case DECEMBER:
			System.out.println(31);
			break;


	}




	}

}
