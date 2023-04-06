//6. Given date in dd-MM-yyyy format.return the month in full name format(January)
//input:"23-01-2012"
//output:January

package set1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {

	public static void main(String[] args) throws ParseException {
		

	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
	    Date date= sdf.parse("23-01-2012");        //parse method converts string date into dateformat
	 
	     sdf.applyPattern("MMMM");                 //MM- gives numerical month e.g. 01=01
	     String str = sdf.format(date);            //MMM- gives first letters of month e.g. 01=Jan
	                                               //MMMM- gives fullname of month e.g. 01= January
	     System.out.println(str);  
	     
	}

}
