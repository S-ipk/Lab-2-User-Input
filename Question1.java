package Lab_2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		/*Write a program with a loop that lets the user enter a series of 
		 * integer numbers. After all the numbers have been entered, the program
		 * should display the largest and smallest numbers entered.
		 */
		
		
				int number, smallest, largest=0;		
		
				Scanner input = new Scanner(System.in);			
				
				
				System.out.println("If you would like to finish press '0' ");
				
				
				System.out.print("Enter your first  number: ");			
				number = input.nextInt();
				
				// Assign first value as smallest
				smallest = number;
				
				// we do not know how many times the user want to enter number so in that case:
				while(number != 0){							
					System.out.print("Enter your next number: ");			
					number = input.nextInt();
					if(number != 0){
						if (number > smallest){
							largest = number;
						}
						else{
							smallest =number;					
						}		
					}
				}//end of while loop
				
				
				System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
		
	}
	

}
