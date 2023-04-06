package arrayassignment;

public class ArrayExample {

	public static void main(String[] args) {
		double[] val = { 10.1, 11.2, 12.3, 13.4, 14.5 };
		double sum = 0;
		for (int i = 0; i < val.length; i++) {
			sum = sum + val[i];
		}
		double average = sum / val.length;
		System.out.println("Average of an array values " + average);

	}

}


