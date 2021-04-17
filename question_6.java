package lab2;

import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
/*
 * Question-6
Write a program that will ask the user to enter the amount of a purchase. 
The program should then compute the state and county tax sales tax. 
Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
The program should display the amount of the purchase , the state sales tax, 
the county sales tax, the total sales tax, and the total of the sale 
(which is the sum of the amount of purchase plus the total sales tax)
 */

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the purchase amount");
		
		double purchase= sc.nextDouble();
		double stateTax=purchase*0.04;
		double countyTax=purchase*0.02;
		double totalTax= stateTax+countyTax;
		
		double totalSale = purchase+totalTax;
		
		System.out.println("purchase amount: "+purchase);
		System.out.println("state sales tax: "+stateTax);
		System.out.println("county tax: "+countyTax);
		System.out.println("total sales tax: "+totalTax);
		System.out.println("total sale : "+totalSale);
		
		
		
		
		
		
	}

}
