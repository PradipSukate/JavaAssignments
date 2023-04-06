package arrayassignment;

import java.util.Scanner;

public class PrintNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int element[] = new int[4];
		System.out.println("Enter a number");
		int i = sc.nextInt();

		element[0] = 12;
		element[1] = 56;
		element[2] = 67;
		element[3] = 98;

		if (i == element[0]) {
			System.out.println("number is present in an array: " + element[0] + " array index is 0");
		} else if (i == element[1]) {
			System.out.println("number is present in an array: " + element[1] + " array index is 1");
		} else if (i == element[2]) {
			System.out.println("number is present in an array: " + element[2] + " array index is 2");
		} else if (i == element[3]) {
			System.out.println("number is present in an array: " + element[3] + " array index is 3");
		} else {
			System.out.println("Element not found in Array");
		}
	}	
}


