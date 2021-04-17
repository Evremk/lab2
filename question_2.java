package lab2;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		
/*Question-2 A bag of cookies holds 40 cookies. 
 * The calorie information on the bag claims that there are 
 * 10 serving in the bag and that a serving equals 300 calories. 
 * write a program that lets the user enter the number of cookies 
 * he or she actually ate and then reports the number of total calories consumed.
 */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Type the number of cookies eaten: ");
		
		int numberCookies = sc.nextInt();
		
		int servingAmount= 4;
		int caloriesPerServing=300;
		int singleCalorie=caloriesPerServing/servingAmount;
		
		System.out.println("You consumed "+singleCalorie*numberCookies+" calories. ");
		
		
		


	}

}
