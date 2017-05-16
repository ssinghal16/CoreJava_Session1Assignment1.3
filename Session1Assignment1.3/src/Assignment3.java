//Write a program that swaps the values of two variables without using third variable.

public class Assignment3 {

	public static void main(String[] args) {
		  int num1 = 20;
          int num2 = 30;
         
          System.out.println("Before Swapping");
          System.out.println("Value of num1 is :" + num1);
          System.out.println("Value of num2 is :" +num2);
         
          num1 = num1 + num2;
          num2 = num1 - num2;
          num1 = num1 - num2;
         
          System.out.println("After Swapping");
          System.out.println("Value of num1 is :" + num1);
          System.out.println("Value of num2 is :" +num2);
  }

}