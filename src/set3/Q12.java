//12)String a="a very fine day"
//output:A Very Fine Day
package set3;

import java.util.StringTokenizer;

public class Q12 {

	public static void main(String[] args) {
		 String a="a very fine day"; 
		 
		
		
		 StringBuffer sb=new StringBuffer();
		 StringTokenizer stk=new StringTokenizer(a," ");
		 
		 while(stk.hasMoreTokens()){   
			                                //t=a   very  fine day
		  String s2=stk.nextToken();
		                                    //s2= a  very  fine day
		  String s3=s2.substring(0,1);  
		                                    //s3= a  v  f  d
		  String s4=s2.substring(1, s2.length()); 
		                                    //s4=  ery  ine  ay
		  sb.append(s3.toUpperCase()).append(s4).append(" "); 
		                                    //s5=A  Very  Fine  Day
		  }
	    System.out.println(sb.toString());
		}
	             

	}


