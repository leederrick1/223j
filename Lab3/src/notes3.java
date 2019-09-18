/*
 * ch1 pg46 # 1,3-5,c9,10,13,15-17, 20
 * programing exercises 1 a-j
 * ch 2 pg 111 1-4, 7,8, 10-20
 */

import javax.swing.JOptionPane;
/*
 * JOptionPane.yes_option returns 0
 * JOptionPane.no_option returns 1
 * JOptionPane.cancel_option returns 2
 */
public class notes3 {
	public static void main(String [] args) {
		/*
		int selection;
		selection = JOptionPane.showConfirmDialog(null, "Do you wish to upgrade to first class?");
		boolean isYesOption;
		isYesOption = (selection == JOptionPane.YES_OPTION);
		
		int cost = 0;
		if(isYesOption)
			cost = 150;
		else
			cost = 100;
		JOptionPane.showMessageDialog(null, "The cost is " + cost);
		
		JOptionPane.showConfirmDialog(null, "A data input has occured", "Data input variable ERROR", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE );
		*/
		
		/*
		int random1 = (int)(Math.random()*6)+1;
		int random2 = (int)(Math.random()*6)+1;
		System.out.println("You rolled "+random1);
		if(random1==random2)
			System.out.println("You rolled a pair!");
			*/
		
		int selection;
		//game counter for title
		int num=1;
		//takes in a int depending on if yes or no is choosen
		selection=JOptionPane.showConfirmDialog(null, "Do you want to play the dice game","Dice Game Begin " +num,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		// if yes is choose int will be 0 if no is choosen program will end

		if(selection == 0) {
			// while player chooses yes for selection it will be 0
			while(selection==0) {
				int diceroll1=(int)(Math.random()*6)+1;
				int diceroll2=(int)(Math.random()*6)+1;
				int diceroll3=(int)(Math.random()*6)+1;
					while(diceroll1!=diceroll2 && diceroll2 != diceroll3) {
						diceroll1=(int)(Math.random()*6)+1;
						diceroll2=(int)(Math.random()*6)+1;
						diceroll3=(int)(Math.random()*6)+1;
						num++;
				}
				//displays dice rolls
					if(diceroll1==diceroll2&&diceroll2 == diceroll3) {
						JOptionPane.showMessageDialog(null, "Dice 1: "+diceroll1+"\nDice 2: "+diceroll2+"\nDice 3: "+diceroll3, "Roll Results", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "Three of your dice are a match!", "Winner", JOptionPane.INFORMATION_MESSAGE);
						selection=JOptionPane.showConfirmDialog(null, "Do you want to play again","Dice Game Begin "+num,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
						
					}
				//if 3 dice match
				//if player chooses no selection will equal 1 loop will close
				
			}
	}
}
}
