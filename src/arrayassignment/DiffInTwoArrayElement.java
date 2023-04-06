
//A integer array is given as input. find the difference between each element.
//Return the index of the largest element which has the largest difference gap.
//input: {2,3,4,2,3}
//logic: 2-3=1,3-4=1,4-2=2,2-3=1
//2 is the max diff between 4 and 2,return the index of 4 i.e 2
//output:2
package arrayassignment;

public class DiffInTwoArrayElement {

	public static void main(String[] args) {
		int a[]= new int [5];
		a[0]= 2;
		a[1]= 3;
		a[2]= 4;
		a[3]= 2;
		a[4]= 3;
	
			for (int i=0; i<a.length; i++) {
			//	for (int j=i+1; i<a.length; j++) {
				int d= 0 + a[i];            //a[0]- a[1]   a[1]- a[2]  a[2]- a[3]  a[3]-a[4]
				
				}
			}
		}
	

