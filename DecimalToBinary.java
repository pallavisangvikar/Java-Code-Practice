package com.wbqa.java.programming;

public class DecimalToBinary {
	//Write a program to convert decimal number to binary format. 
	
	public void convertBinary(int num){
	     int binary[] = new int[8];
	     int index = 0;
	     
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	  }
	 
	  public static void main(String a[]){
	     DecimalToBinary obj = new DecimalToBinary();
	     System.out.println("Binary representation of 14: ");
	     //System.out.println(Integer.toBinaryString(14));
	     obj.convertBinary(14);
	     System.out.println("\nBinary representation of 124: ");
	     //System.out.println(Integer.toBinaryString(124));
	     obj.convertBinary(124);
	     System.out.println("\nBinary representation of 45: ");
	     //System.out.println(Integer.toBinaryString(45));
	     obj.convertBinary(45);
	  }

}
