/*
 * Derrick Lee
 * 9/10/17
 * Lab 3: DICE Game
 * This program rolls 3 dice using rng and displays through a GUI. You win if you have 2 or 3 dice that match.
 */
import javax.swing.JOptionPane;
public class lab3 {
	public static void main(String [] args) {
		int selection;
		//game counter for title
		int num=1;
		//takes in a int depending on if yes or no is choosen
		selection=JOptionPane.showConfirmDialog(null, "Do you want to play the dice game","Dice Game Begin " +num,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		boolean isYesOption;
		isYesOption = (selection == JOptionPane.YES_NO_OPTION);
		// if yes is choose int will be 0 if no is choosen program will end
		if(selection == 0) {
			// while player chooses yes for selection it will be 0
			while(selection==0) {
				int diceroll1=(int)(Math.random()*6)+1;
				int diceroll2=(int)(Math.random()*6)+1;
				int diceroll3=(int)(Math.random()*6)+1;
				//displays dice rolls
				JOptionPane.showMessageDialog(null, "Dice 1: "+diceroll1+"\nDice 2: "+diceroll2+"\nDice 3: "+diceroll3, "Roll Results", JOptionPane.INFORMATION_MESSAGE);
				//if 3 dice match
				if(diceroll1==diceroll2 && diceroll1 == diceroll3)
					JOptionPane.showMessageDialog(null, "Three of your dice are a match!", "Winner", JOptionPane.INFORMATION_MESSAGE);
				//if 2 dice match
				else if(diceroll1==diceroll2 || diceroll1 == diceroll3 || diceroll2 == diceroll3)
					JOptionPane.showMessageDialog(null, "Two of your dice are a match!", "Winner", JOptionPane.INFORMATION_MESSAGE);
				//no dice match
				else
					JOptionPane.showMessageDialog(null, "Better luck next time!", "Loser", JOptionPane.WARNING_MESSAGE);
				num++;
				//if player chooses no selection will equal 1 loop will close
				selection=JOptionPane.showConfirmDialog(null, "Do you want to play again","Dice Game Begin "+num,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				
			}
		}
		
	}
}
