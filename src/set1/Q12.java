//12. accept a string and find if it is of date format "dd/mm/yyyy".
//input:01/13/2012
//output:false
package set1;

import java.util.StringTokenizer;

public class Q12 {
	public static void main(String[] args) {
		String s="30/10/2012";						
		boolean b1=false;
		StringTokenizer t=new StringTokenizer(s,"/");
		int date=Integer.parseInt(t.nextToken());
		int month=Integer.parseInt(t.nextToken());
		String s1=t.nextToken(); //s1 is year
		int year=Integer.parseInt(s1);
		
		int year_Length=s1.length();
		if(year_Length==4)
		{
			if(year%4==0)
			{
				if((month==2)&&(date<=29))
					b1=true;
				else if((month==4)||(month==6)||(month==9)||(month==11)&&(date<=30))
					b1=true;
				else if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)&&(date<=31))
					b1=true;
			   }else
			   {
				   if((month==2)&&(date<=28))
					   b1=true;
				   else if((month==4)||(month==6)||(month==9)||(month==11)&&(date<=30))
					   b1=true;   
				   else if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)&&(date<=31))
					   b1=true;
			   }
		}
		if(b1==true)
			System.out.println("True");
		else
			System.out.println("false");
		
		}
	
}
