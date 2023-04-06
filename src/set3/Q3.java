/*3)Given array of string check whether all the elements contains only digits not any alphabets.
if condition satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1
Input1:{"asd","123","42.20"}
output:-1*/
package set3;

public class Q3 {

	public static void main(String[] args) {

		String s1[] = { "123", "23.14", "522" };
		char c = 0 ;

		for (int i = 0; i < s1.length; i++) {

			String s2 = s1[i];
			for (int j = 0; j < s2.length(); j++) {
				c = s2.charAt(j);
			}
			if (Character.isDigit(c)) {
				System.out.println("1");
			} else {
				System.out.println("-1");
				break;
			}
		}

	}

}
