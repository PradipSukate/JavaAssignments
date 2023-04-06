/*4)int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.*/
package set3;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		
           int a[]= {12,14,2,26,35};
           int max=0, min=0;
           
           Arrays.sort(a);      //arrays.sort method arrange ascending order of array elements         
         
           int diff= a[a.length-1] - a[0];
           System.out.println(diff);
          
	}

}
