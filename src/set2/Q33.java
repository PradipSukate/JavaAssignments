//33. Retrieve the odd-position digits from input integer array.
//Multiply them with their index and return their sum.
package set2;

public class Q33 {

	public static void main(String[] args) {
		int input[] = { 7, 4, 3, 2, 5, 6 };
		int c;
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			if (i % 2 != 0) {
				c = input[i] * i;
				sum = sum + c;
			}
		}
		System.out.println(sum);
	}

}
