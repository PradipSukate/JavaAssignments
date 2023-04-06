//21.  Find the number of days between two input dates.
package set2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q21 {

	public static void main(String[] args) {
	     
		LocalDate date1 = LocalDate.of(2022, Month.DECEMBER, 01);
	    
		LocalDate date2 = LocalDate.of(2022, Month.DECEMBER, 31);
		long noOfDaysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(noOfDaysBetween);
	   }    
	

	}


