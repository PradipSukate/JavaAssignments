//7. Two dates are given as input in "yyyy-MM-dd" format. 
//Find the number of months between the two dates
//input1:"2012-12-01"
//input2:"2012-01-03"
//output:11
package set1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q7 {

	public static void main(String[] args) throws ParseException {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		 Date input1= sdf.parse("2012-12-01");
		 
		 Date input2= sdf.parse("2012-01-03");
		 
		 Calendar calender= Calendar.getInstance();
		 calender.setTime(input1);
		int i1= calender.get(Calendar.MONTH);
		int y1= calender.get(Calendar.YEAR);
		
		 calender.setTime(input2);
			int i2= calender.get(Calendar.MONTH);
			int y2= calender.get(Calendar.YEAR);
			
			int diff= (y1-y2)*12 + i1-i2 ;
			System.out.println(diff);
	}

}
