package com.wbqa.java.programming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CountVowels {
	// Write a program to read a file / sentence and count number of characters which are vowels
	
	public static void countFromFile(){
		int count = 0;
		 //String path = "C:/Users/Pallavii/workspace/Java Sessions/src/com/wbqa/java/programming/Test.txt";
		String path = "./src/com/wbqa/java/programming/Test.txt";
		
        try {

               InputStream in= new FileInputStream(path);

               int c;

               while((c=in.read())!=-1){
               	char c1 = (char) Character.toLowerCase(c);
              	 if(c1 =='a'|| c1=='e'|| c1=='i'|| c1=='o' || c1=='u'){
              		
              		count++;
              	//	System.out.println((char)c);
              	 }

               }
               
        } catch (FileNotFoundException e) {

               e.printStackTrace();

        } catch (IOException e) {

               e.printStackTrace();

        } 
        System.out.println(count+" characters are vowels in this file.");

	}
	
	//@SuppressWarnings("resource")
	public static void countFromSentence(){
		int count =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a sentence for vowel count: ");
	    String sentence = scan.nextLine(); 
	    //System.out.println(sentence.length());

	    for(int i=0;i<sentence.length();i++){
	    	char c = (char) Character.toLowerCase(sentence.charAt(i));
	    	if(c=='a'|| c=='e'|| c=='i'|| c=='o' || c=='u'){
          		
          		count++;
          	//	System.out.println((char)c);
          	 }
	    	
	    }
	    System.out.println(count+" characters are vowels in given sentence.");
		
	}
	public static void main(String[] args) {
		
		//countFromFile();
		countFromSentence();

	}

}
