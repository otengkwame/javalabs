/*
This program allows a user to enter three 
test scores and outputs its average.

    Input Variables
    testScoreOne, testScoreTwo, testScoreThree
    
    Processing formular
    (testScoreOne + testScoreTwo + testScoreThree)/3

    Output Variables
    testScoreOne, testScoreTwo, testScoreThree
    averageTestScore 
*/

//Import the JOptionPane class
import javax.swing.JOptionPane;

public class TestAverage {
    public static void main(String[] args){
        
        //Variables here
        String testScoreOne, testScoreTwo, testScoreThree;
      
        //Assign to the JOptionInputDialog
        testScoreOne = JOptionPane.showInputDialog("Enter your first score");
        testScoreTwo = JOptionPane.showInputDialog("Enter your second score");
        testScoreThree = JOptionPane.showInputDialog("Enter your third score");
        
        //Processing formular
        Double testScoreOneD = Double.parseDouble(testScoreOne);
        Double testScoreTwoD = Double.parseDouble(testScoreTwo);
        Double testScoreThreeD = Double.parseDouble(testScoreThree);
        
        Double averageTestScore = (testScoreOneD + testScoreTwoD + testScoreThreeD) / 3;
        
        String Output = "The test scores are " + testScoreOneD + ", " + testScoreTwoD + 
                ", " + testScoreThreeD;
        String OutputAverage = "Our Average Score is: " + averageTestScore;
        //Output the three scores
        JOptionPane.showMessageDialog(null, Output);
        
        //Output AverageScore
        JOptionPane.showMessageDialog(null, OutputAverage);
        
    }
}

























