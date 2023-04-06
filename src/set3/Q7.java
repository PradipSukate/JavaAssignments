/*7) arraylist1={ 1,2,3,4,5}
    arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}*/
package set3;

public class Q7 {

	public static void main(String[] args) {
		int input1[] = { 1, 2, 3, 4, 5 };
		int input2[] = { 6, 7, 8, 9, 10 };
		int output[] = new int[input1.length];  // output array taken to store new elements extracted from input1 & input2

		if (input1.length == input2.length)
			for (int i = 0; i < input1.length; i++) {
				if (i % 2 == 0) {
					output[i] = input2[i];
				} else {
					output[i] = input1[i];
				}

			}
		
		for (int a : output) { // we can not print direct output, because it is an array, to print elements inside array
							// use for each loop to iterate over output array.
			System.out.print(a + ",");	
		}
	}

}
