/*
 * Derrick Lee
 * 9/17/19
 * Lab 5: Virtual pet
 * This lab goes more in depth about class attributes as well as static functions
 */
package virtualpet;
//used to take in inputs
import java.util.Scanner;
public class main {
	public static void main(String []args) {
		String name;
		int choice=0;
		boolean check = true;
		//prints out ascii chicken
		System.out.println("Virtual Chicken");
		System.out.println("     ____\n" + 
				"    /.__.\\\n" + 
				"    \\ \\/ /\n" + 
				" '__/    \\\n" + 
				"  \\-      )\n" + 
				"   \\_____/\n" + 
				"_____|_|____");
		System.out.println("Please enter a name for your pet chicken: ");
		Scanner input = new Scanner(System.in); // creating a new scanner for inputs
		name = input.nextLine();//enter the name of the pet
		VirtualPet chicken=new VirtualPet(name);//creates a new pet with parameter for name
		System.out.println("Initializing Stats.....");
		printStats(chicken);//prints out stats functions
		System.out.println(name +" was born");
		
		//while the check is true will continue the loop
		while(check!= false) {
			printMenu(); // displays menu
			choice=input.nextInt(); // takes in a number 
			chicken.choice(choice); // base on a number will display an action
			printStats(chicken);// prints out new stats
			//if chicken reaches age 10 it dies
			if(chicken.getAge()==10)
				check=false;
			//if user selects 5 program will exit
			if(choice==5)
				check=false;
			
		}
		// if the chicken died it will tell you
		if(chicken.getAge()==10) {
			System.out.println(name + " Died of old age");
			System.out.println("\n" + 
					"                  _  /)\n" + 
					"                 .. / )\n" + 
					"                 |/)\\)\n" + 
					"                  /\\_\n" + 
					"                  \\__|=\n" + 
					"                 (    )\n" + 
					"                 __)(__\n" + 
					"           _____/      \\\\_____\n" + 
					"          |  _     ___   _   ||\n" + 
					"          | | \\     |   | \\  ||\n" + 
					"          | |  |    |   |  | ||\n" + 
					"          | |_/     |   |_/  ||\n" + 
					"          | | \\     |   |    ||\n" + 
					"          | |  \\    |   |    ||\n" + 
					"          | |   \\. _|_. | .  ||\n" + 
					"          |                  ||\n" + 
					"          |  "+name+"  ||\n" + 
					"          |      dude         ||\n" + 
					"  *       | *   **    * **   |**      **\n" + 
					"   \\))...../.,(//,,..,,\\||(,,.,\\\\,.((//");
		}
		// program exits
		System.out.println("Quitting program....");
	}
	//function will print the stats 
	public static void printStats(VirtualPet chicken) { // takes a virtualpet objects to access its privates
		System.out.println(chicken.getName()+ " Stats: ");
		System.out.println("Hunger: " +chicken.getHunger());
		System.out.println("Cleanliness: " +chicken.getClean());
		System.out.println("Happiness: " +chicken.getHappy());
		System.out.println("Health: " +chicken.getHealth());
		
	}
	public static void printMenu() { // prints out the menu options
		System.out.println("Main Menu:");
		System.out.println("1.Feed\n2.Wash\n3.Play\n4.Health\n5.-Quit-");
		System.out.println("Enter a number");
	}
}
