/*20)Square root calculation of
   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
   o/p should be rounded of to int;*/

package set3;

public class Q20 {

	public static void main(String[] args) {
		int x1=2, x2=3, y1=4, y2=5;
		
		int output= (int)(Math.sqrt(((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))));  // sqrt is method from math class
		                                                       // which give square root of given number in double datatype
        System.out.println(output);
	}

}
 