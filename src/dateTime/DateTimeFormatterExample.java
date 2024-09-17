package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//DateTimeFormatter class
public class DateTimeFormatterExample {

	public static void main(String[] args) {
	    LocalDateTime timestamp = LocalDateTime.now();
		System.out.println(timestamp);
		
		
		
		//DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
		//returns a formatter using the specified pattern
		
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//format()
		//formats this date-time using the specified formatter.
		//returns the formatted date-time string
		String ts = timestamp.format(formatter);
		System.out.println(ts);
		
		//E return day of the week //e.g.Wed
		formatter=DateTimeFormatter.ofPattern("E dd-MMM-yyyy");
		ts=timestamp.format(formatter);
		System.out.println(ts);
	
		
		//B return day of the week //e.g. in the morning
				formatter=DateTimeFormatter.ofPattern("B dd-MMM-yyyy");
				ts=timestamp.format(formatter);
				System.out.println(ts);
				
	}

}
