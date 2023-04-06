//22. Enter your name and return a string print the title first and then comma and
//	 then first letter of initial name.
package set2;

import java.util.StringTokenizer;

public class Q22 {

	public static void main(String[] args) {
	 
		 String name= "pradip sukate";
		 StringTokenizer st= new StringTokenizer(name, " ");
	     String firstName=  st.nextToken();
	     String lastName=   st.nextToken();
	     
	     StringBuffer sb= new StringBuffer(firstName);
	     StringBuffer newName= sb.append(',').append(lastName.charAt(0));
	     System.out.println(newName);

	
	}
}
