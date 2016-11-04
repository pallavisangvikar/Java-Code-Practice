package edu.wbqa.assignments;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
	    int num = scan.nextInt();
		
		
			if(num%3 == 0 && num%5 == 0)
				System.out.println(" Ping Pong ");
			else if(num%3 == 0)
				System.out.println(" Ping ");
			else if(num%5 == 0)
				System.out.println(" Pong ");
			else
				System.out.println(num);
				
						
		}

	

	}


