import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class SumProductPanel extends JPanel 
{
	 private String integer1, integer2;
	 private int number1, number2, finalSum;
	
	 public SumProductPanel()
	 {
		 
		integer1 = JOptionPane.showInputDialog(integer1, "Please input integer 1: " );	
		integer2 = JOptionPane.showInputDialog(integer2, "Please input integer 2: " );		
		
		number1 = Integer.parseInt(integer1);
		number2 = Integer.parseInt(integer2);
		finalSum = number1 + number2;

		JOptionPane.showMessageDialog(null, "Final sum is: " + finalSum);
		
	     
	 }
}
