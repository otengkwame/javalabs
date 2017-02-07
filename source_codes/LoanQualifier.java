//import JOptionPane class 
import javax.swing.JOptionPane;  

/**
   This program asks for a user to input his/her
   Annual Salary and Years On Current Job which 
   Checks whether he/she qualifies to apply for a loan
*/

public class LoanQualifier
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job
      String input;        // To hold string input

      // Get the user's annual salary.
      input = JOptionPane.showInputDialog("Enter your " +
                                       "annual salary.");
      salary = Double.parseDouble(input);

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = Double.parseDouble(input);

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000)
      {
         if (yearsOnJob >= 2)
         {
            JOptionPane.showMessageDialog(null, "You qualify " +
                                               "for the loan.");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "You must have " +
                        "been on your current job for at least " + 
                        "two years to qualify.");
         }
      }
      else
      {
            JOptionPane.showMessageDialog(null, "You must earn " +
                         "at least $30,000 per year to qualify.");
      }
      
      System.exit(0);
   }
}
