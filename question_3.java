package lab2;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
	
/*Question-3

Write a program that asks the user for a positive nonzero integer value. 
The program should use a loop to get the sum of all the integers from 1 up 
to the number entered.*/
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Type a positive number, which is not zero");
		int sum=0;
		int num= sc.nextInt();
		if(num<=0) {
			System.out.println("Invalid number");
		}else
		
		   for(int i=1;i<=num;i++) {
			sum=i+sum;
			}
			
			System.out.println("The sum of all numbers until " +num+ " is " +sum);
			
			
			
	
		}
		
		
		
		

	}
	   




