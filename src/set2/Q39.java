//39.  input="xyzwabcd"
//    intput2=2;
//    input3=4;
//    output=bawz
package set2;

public class Q39 {

	public static void main(String[] args) {
		String input = "xyzwabcd";

		int input2 = 2;
		int input3 = 4;

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();

		String result = sb.substring(input2, input2 + input3);
		System.out.println(result);
	}
}
