//Write a program in java to compare the truth table of Bitwise AND and Logical AND.

//Package declaration 
package com.acadgild.assignment3;

//Scanner class
import java.util.Scanner;

//Class declaration
public class Assignment3 {

	//Method to compare the truth table of Bitwise AND and Logical AND
	public static void compareThruthTable(byte a, byte b){
		System.out.println("The output of the Bitwise (&) is: "+(a&b));
		  System.out.println("The output of the Logical AND is: "+(a>0&&b>0));
	}
	//Main method
	public static void main(String[] args) {
		byte a, b;
		Scanner s = new Scanner ( System.in );
		Scanner s1 = new Scanner ( System.in );
		
		System.out.print("Enter First byte (only 0 and 1 are allowed): ");
		a = s.nextByte();
		
		System.out.print("Enter Second byte (only 0 and 1 are allowed): ");
		b = s1.nextByte();
		//Calling of function 
		compareThruthTable(a,b);
	}

}
