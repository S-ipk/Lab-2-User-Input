package Lab_2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*Write a program that asks the user for a positive nonzero integer value.
		 * The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
		 */

		 Scanner input = new Scanner(System.in);
		 
		 
		 int number=1, sum=0;
		 
		 System.out.println("Enter  positive nonzero value:");
		 number = input.nextInt();
		 
		 
		 
		 for (int i = 1; i <= number ; i++) {
			
			 sum += number;
		}//end of for loop
		 
		 System.out.println("Sum of numbers :  " +sum);
		 
	}

}
