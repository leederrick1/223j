

import javax.swing.JOptionPane;
public class gui {
	public static void main(String []args) {
		int num = 30;
		double bankBalance = 999.99;
		float myMoney = 47.82f; // need to type cast it 
		int dollars = (int)myMoney;
		// when working with numbers in java make sure to type cast
		JOptionPane.showMessageDialog(null, "hello dialog");
		
		String result;
		result = JOptionPane.showInputDialog(null,"What is your name?");
		JOptionPane.showMessageDialog(null, "hello "+ result);
		
		result = JOptionPane.showInputDialog(null,"Display Message","GUI Lab Practice",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Display message", "title bar",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Display message", "title bar",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Display message", "title bar",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Display message", "title bar",JOptionPane.WARNING_MESSAGE);
		/*
		 * JOptionPane.Error_Message
		 * JOptionPane.Information_Message
		 * JOptionPane.Plain_Message
		 * 			  .Question_Message
		 * 			  .Warning_Message
		 */
		int myNum= Integer.parseInt(result);
		//Double.parseDOuble(result);
		
		
	}

}
