package arrayassignment;

import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
		//Addition of Array without Scanner Class
		/*
		 * int array1[]= {0,1,2,6}; int array2[]= {3,4,5,8}; int resultarray[]= new int
		 * [array1.length] ;
		 * 
		 * for (int i=0; i<array1.length; i++) { // int resultarray[]= array1.length= 4
		 * resultarray[i]= array1[i]+ array2[i]; //resultarray[4]= array1[4] + array2[4]
		 * System.out.println(resultarray[i]); }
		 */
	
		//Addition of Array with Scanner Class
		  Scanner scan = new Scanner(System.in);
          
          int array1[]= {0,1,2};
          int array2[]= {3,4,5};



         System.out.print("Enter number of elements in first array: ");
         for (int i=0; i<array1.length; i++) {
             array1[i] = scan.nextInt();  // take input for array1 elements
           }
          
          System.out.print("Enter number of elements in second array: ");
          for (int i=0; i<array2.length; i++) {
              array2[i] = scan.nextInt();  // take input for array2 elements
          }
           
          int resultarray[]=new int [array1.length];
          
          for(int i=0;i<array1.length;i++)
          {                
               resultarray[i]=array1[i]+array2[i];
               System.out.println(resultarray[i]);
          }
	}
	}

