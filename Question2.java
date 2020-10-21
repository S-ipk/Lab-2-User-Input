package Lab_2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int cookies,bagOfCookies ,caloriesPerCookie, totalCalories;
		
		System.out.println("How many cookies you ate: ");
		cookies  = input.nextInt();
		
		bagOfCookies = 40/10;
		caloriesPerCookie = 300/bagOfCookies;
		totalCalories = cookies * caloriesPerCookie;
		
		System.out.println("Total calories: " + totalCalories);

	}
	
	

}
