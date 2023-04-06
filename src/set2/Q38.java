//38.Return  months between two dates
package set2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q38 {

	public static void main(String[] args) {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 
		 Date input1 = null;
		try {
			input1 = sdf.parse("2022-05-24");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Date input2 = null;
		try {
			input2 = sdf.parse("2020-12-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
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
