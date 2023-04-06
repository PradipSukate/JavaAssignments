package arrayassignment;

import java.util.Scanner;

public class PrimeNoUsingForLoop {

	public static void main(String[] args) {
		int num;
		// boolean flag= false;
		int count = 0;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				// flag = true;
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Number is a prime number:");
		} else {
			System.out.println("Number is not a prime number!");
		}

	}

}
	
	

