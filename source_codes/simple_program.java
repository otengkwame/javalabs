//A simple java program
//Import the Scanner classs
import java.util.Scanner;

public class simple_program{
	public static void main(String[] args){
		//Create and add two variables
		//Assign it to a sum variable
		//Display the result
		
		int number1, number2, sum;
		//Instantiate the my scanner class
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter first number");
		number1 = keyboard.nextInt();
		
		System.out.print("Enter second number");
		number2 = keyboard.nextInt();
		
		sum = number1 + number2;
		System.out.print("The first number is " + number1 
		+ " and the second number is " + number2 + " which equals " +
		sum);
	}
	
	
	
	
	
}