package Lab_2;

import java.util.Scanner;

import jdk.jfr.Percentage;

public class Question4 {

	public static void main(String[] args) {
		
		/*Write a program that asks user for the number of males and the number of females registered in a class.
		 * 
		 * The program should display the percentage of males and females in the class.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many males do you have in your class? : ");
		int males  = input.nextInt();
		
		System.out.println("How many females do you have in your class? : ");
		int females = input.nextInt();
		
		percentage(males, females);
	

	}
	
	public static void percentage(int males , int females) {
		
		int percentageOfmales =(males*100)/ (males+females);
		int percentageOffemales = (females*100)/ (males+females); 
		
		System.out.println("Percentage of males are: %" + percentageOfmales);
		System.out.println("Percentage of females are: %" + percentageOffemales);
		
	}

}
