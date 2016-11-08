package com.wbqa.java.programming;

public class BinaryToDecimal {
	//Write a program to convert binary to decimal number format using. 

	public int convertDecimal(int binary){
        
        int decimal = 0;
        int power = 0;
        while(binary != 0){
        	
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            
        }
        return decimal;
    }
     
    public static void main(String a[]){
        BinaryToDecimal bd = new BinaryToDecimal();
        System.out.println("Decimal representation of 11 : "+bd.convertDecimal(11));
        System.out.println("Decimal representation of 110 : "+bd.convertDecimal(110));
        System.out.println("Decimal representation of 1110 : "+bd.convertDecimal(1110));
        System.out.println("Decimal representation of 11011001 : "+bd.convertDecimal(11011001));
                
    }

}
