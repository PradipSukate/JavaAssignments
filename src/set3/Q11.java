/*11)Get all the numbers alone from the string and return the sum.
Input"123gif"
Output:6*/
package set3;

public class Q11 {

	public static void main(String[] args) {

		String input = "456gif";
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c))
                
				sum = sum + Integer.parseInt(String.valueOf(c));

		}
		System.out.println(sum);
	}

}
