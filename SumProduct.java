import javax.swing.JFrame;

public class SumProduct {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Sum Product");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      SumProductPanel panel = new SumProductPanel();
	      frame.getContentPane().add(panel);

	      frame.pack();
	      frame.setSize(500,200);
	      frame.setVisible(true);
	   }
}
