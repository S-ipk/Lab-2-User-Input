package Lab_2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double amountOfPurchase, theStateOfTax, theCountryofTax, theTotalOfTax;
		
		double totalSalesTax, theTotalOfTheSale;
		
		System.out.println("Enter amount of the purchase:");
		amountOfPurchase = scanner.nextDouble();
		
		theStateOfTax = 0.04;
		theCountryofTax = 0.02;
		theTotalOfTax = theStateOfTax + theCountryofTax ;
		totalSalesTax = amountOfPurchase * theTotalOfTax;
		theTotalOfTheSale = amountOfPurchase + totalSalesTax;
		
		System.out.println("***************************************");
		System.out.println("The amount of the purchase-> " + amountOfPurchase);
		System.out.println("The state of the tax-> "  +theStateOfTax);
		System.out.println("The country of the tax-> " + theCountryofTax);
		System.out.println("The total of the tax-> "  +theTotalOfTax);
		System.out.println("The total of sales tax-> " + totalSalesTax);
		System.out.println("The total of the sale-> " + theTotalOfTheSale);

	}

}
