/*6)input={"1","2","3","4"}
    output=10
ie,if string elements are nos,add it.
    input={"a","b"}
    output=-1;*/
package set3;

public class Q6 {

	public static void main(String[] args) {
		// String input[]= {"a","b"};
		String input[] = { "1", "2", "3", "4" };
		int sum = 0;
		boolean b = false;
		String str = null;

		for (int i = 0; i < input.length; i++) {
			str = input[i];
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (Character.isDigit(c)) {
					b = true;
				} else {
					b = false;
				}
			}
			if (b == true) {
				sum = sum + Integer.parseInt(str);
				System.out.println(sum);
			} else {
				System.out.println(-1);
			}
		}
	}
}
