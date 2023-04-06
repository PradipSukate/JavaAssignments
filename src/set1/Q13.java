//13. Get a integer array as input.
//Find the average of the elements which are in the position of prime index
//input:{1,2,3,4,5,6,7,8,9,10}
//logic:3+4+6+8(the indices are prime numbers)
//output:21
package set1;

public class Q13 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		char[] ch = new char[10];

		int sum = 0;
		String s = "";
		for (int i = 2; i < a.length; i++) // i=2 i=3 i=4 i=5
		{
			int c = 0;

			for (int j = 1; j <= i; j++) // j=1 ,2 j=1,2,3 1,2
			{
				if (i % j == 0)         // 2%1= 0 ,2%2=0 3%1=0 3%2!=0 3%3=0 4%1=0 4%2=0 4%3!=0 4%4=0
								        // 5%1=0 5%2!=0 5%3!=0 5%4!=0 5%5=0
					c++;                // c=1,c=2 c=1,2 1,2 3 1 2
			}

			if (c == 2)                 // when c=2 then
			{
				ch[i] = ',';
				s = s + a[i] + ch[i];   // s=s+a[i]:- s=3 ,34
				sum += a[i];            // sum= 3 3+4=7 +6+8=21
			}
		}
		System.out.println("Prime index elements are:" + s);
		System.out.println("Sum of elements is:" + sum);
	}

}
