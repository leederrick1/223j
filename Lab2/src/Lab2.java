/*
 * Derrick Lee
 * 9/5/19
 * Lab 2: Input output
 * this Lab shows how to use input and outputs in gui
 */
import javax.swing.JOptionPane;
public class Lab2 {
	public static void main(String [] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to mad lib", "intro bar", JOptionPane.ERROR_MESSAGE);
		String result1,result2,result3,result4;
		//takes in inputs and stores them in result variables
		result1 = JOptionPane.showInputDialog(null,"Please enter a noun", "Noun1",JOptionPane.INFORMATION_MESSAGE);
		result2 = JOptionPane.showInputDialog(null,"Please enter a past tense verb", "Verb",JOptionPane.INFORMATION_MESSAGE);
		result3 = JOptionPane.showInputDialog(null,"Please enter a noun", "Noun2",JOptionPane.INFORMATION_MESSAGE);
		result4 = JOptionPane.showInputDialog(null,"Please enter a adjective", "Adjective",JOptionPane.INFORMATION_MESSAGE);
		//prints out final mad lib
		JOptionPane.showMessageDialog(null, result1 + " plays fortnite. \n" + result3 +" "+ result2+" to his death" +".\nFortnite players are "+ result4 +".\n","Mad lib Output",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Well to torblox tax", "intro bar", JOptionPane.ERROR_MESSAGE);
		String taxResult;
		//takes in a string number
		taxResult= JOptionPane.showInputDialog(null, "Please provide your taxable income?", "tax input", JOptionPane.INFORMATION_MESSAGE);
		//turns the string into a int
		int taxable = Integer.parseInt(taxResult);
		float incomeTax= 0;
		//calculates the tax based on income range ALSO HAS TO TURN EVERYTHING INTO FLOAT BECAUSE I DIDN'T REALISE TILL I WAS TOO FAR INTO THE IF STATEMENTS
		if(taxable == 0 || taxable<=9325) {
			incomeTax = .1f* (float)taxable;
		}
		else if(taxable >9325 && taxable <=37950) {
			incomeTax = 932.50f+(.15f*(taxable-9325));
		}
		else if(taxable >37950 && taxable <=91900) {
			incomeTax = 5226.25f+(.25f*(taxable-37950));
		}
		else if(taxable >91900 && taxable <=191650) {
			incomeTax = 18713.75f+(.28f*(taxable-91900));
		}
		else if(taxable >191650 && taxable <=416700) {
			incomeTax =46643.75f+(.33f*(taxable-191650));
		}
		else if(taxable >416700 && taxable <=418400) {
			incomeTax = 120910.25f+(.35f*(taxable-416700));
		}
		else if(taxable > 418400) {
			incomeTax = 121505.25f+(.396f*(taxable-418400));
		}
		else {
			JOptionPane.showMessageDialog(null, "you cant have negative income. its not taxable", "error", JOptionPane.ERROR_MESSAGE);
			//else message will be outputted if the number isn't greater than zero
		}
		//outputs the final federal tax income
		JOptionPane.showMessageDialog(null, "Your Federal Income Tax is "+ incomeTax,"Tax output", JOptionPane.QUESTION_MESSAGE);
		
	}
	

}
