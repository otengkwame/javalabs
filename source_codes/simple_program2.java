//Import the JOptionPane
import javax.swing.JOptionPane;

public class simple_program2 {
	public static void main(String[] args){
		//Declare variables
		String number1, number2;
		//Ask user to input in the values
		number1 = JOptionPane.showInputDialog("Enter first number");
		number2 = JOptionPane.showInputDialog("Enter second number");
	
		//Convert to integer
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		//Add and assign to the sum variable
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"The sum of the numbers are " + sum);
	}
}