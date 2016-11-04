package edu.wbqa.assignments;

import java.util.Scanner;

public class ArmstrongNumber {
	//An Armstrong number or a plus perfect number is a number that is 
	//the sum of its own digits each raised to the power of the number of digits.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, temp, n;
		System.out.println("Enter the number:");
	    int num = scan.nextInt();
	    temp = num;
	    while(temp!=0)
	    {
	    	n = temp%10;
	    	sum += n*n*n;
	    	temp = temp/10;
	    }
	    if(num == sum)
	    	System.out.println(num+ " is an Armstrong Number.");
	    else
	    	System.out.println(num+ " is not an Armstrong Number.");
	}

}
