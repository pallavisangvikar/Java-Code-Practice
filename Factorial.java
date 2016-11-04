package edu.wbqa.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// n!=prod_{k= 1 to n} k. eg. 5! = 5 * 4 * 3 * 2 * 1 = 120. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the for finding factorial: ");
	    int num = scan.nextInt();
	    
	    
	    int fact = 1;
	    for(int i =1; i<=num; i++){
	    	fact = fact * i;
	    }
	    System.out.print("The factorial of " +num+ "("+num+"!) is: "+fact);	

	}

}
