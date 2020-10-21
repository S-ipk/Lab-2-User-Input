package Lab_2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		/*Write a program that computes the tax and tip on a restaurant bill. The program should ask the user
		 * to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
		 * The tip should be 20 percent of the total after adding tax.
		 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double mealCharge, taxAmount,totalWithTax, tipAmount, totalBill;
		
		System.out.println("Enter the charge of the meal: ");
		mealCharge = input.nextDouble();
		input.nextLine();
		
		taxAmount = mealCharge * 0.0675;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * 0.20;
		totalBill = totalWithTax + tipAmount;
		
		System.out.println("************************************");
		System.out.println("Your meal charge amount is " + mealCharge + ".");
		System.out.println("Your tax amount is " + taxAmount + ".");
		System.out.println("Your tip amount is " + tipAmount + ".");
		//total is:
		System.out.println("Your total bill amount is " + totalBill + ".");
		
		
		
		
		
		
		
		
		



	}

}
