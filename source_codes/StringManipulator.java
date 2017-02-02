/*
Write a program that asks the user to enter the name of 
his or her favorite city. Use a String variable to store the 
input. The program should display the following
*/

//Import the JOptionPane Class
import javax.swing.JOptionPane;

public class StringManipulator {
    public static void main(String args[]){
        //Ask user to input favourite city
        String askFavouriteCity = JOptionPane.showInputDialog("Please enter favourite city");
        
        //Number of characters
        JOptionPane.showMessageDialog(null, "Number of characters in city " + askFavouriteCity + " is " + askFavouriteCity.length());
        //To UpperCase
        JOptionPane.showMessageDialog(null, "To uppercase " + askFavouriteCity.toUpperCase());
        //To LowerCase
        JOptionPane.showMessageDialog(null, "To uppercase " + askFavouriteCity.toLowerCase());
        //First Character of City name
        JOptionPane.showMessageDialog(null, "First character is: " + askFavouriteCity.charAt(0));
        
    }
}
















