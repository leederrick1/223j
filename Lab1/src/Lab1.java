/*
 * Derrick Lee
 * 9/3/19
 * Lab 1: Input Output
 * This lab we learn how to use input and output as well as mirror c++ code into java.
 */
import java.util.Scanner;
public class Lab1 {
	public static void main(String []args) {
		
		//Program 1: This program checks to see if a year is a leap year
		System.out.println("Enter a year");
		Scanner input = new Scanner(System.in); // creating a new scanner for inputs
		int year = input.nextInt();
		if(year%4==0) { //checks if the year is the  year is divisable by 4 and remainder is 0 
			if(year%100==0) { //checks if the year is the  year is divisable by 100 and remainder is 0
				if(year%400==0) {//checks if the year is the  year is divisable by 400 and remainder is 0
					System.out.println(year + " is a leap year."); 
				}
				else {
					System.out.println(year + " is not a leap year");
				}
			}
			
			else {
				System.out.println(year + " is a leap year.");
			}
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
		
	    //Program 2: This program takes a name and an age and will output a category for the age
		System.out.println("Enter the person's name:");
		input.nextLine();
		String name =input.nextLine(); // takes in a string for name
		System.out.println("Enter the person's age");
		int age = input.nextInt();// takes in a int for age
		String category = "";
		//based on the person's age it will assign a category
		if(age<1) {
			category = "infant";
		}
		else if(age>=21 && age<=3) {
			category = "toddler";
		}
		else if(age>=4 && age<=5) {
			category = "preschooler";
		}
		else if(age>=6 && age<=12) {
			category = "grade schooler";
		}
		else if(age>=13 && age<=18) {
			category = "teenager";
		}
		else if(age>=19 && age<=21) {
			category = "young adult";
		}
		else if(age>21) {
			category = "adult";
		}
		System.out.println(name + " is a " + category);
		
	
		//Program 3: Inputs mailing address variables and puts it all together
		System.out.println("Enter your street");
		input.nextLine();
		String street = input.nextLine();
		System.out.println("Enter your house or apartment number");
		int aptnum = input.nextInt();
		System.out.println("Enter your city");
		input.nextLine();
		String city = input.nextLine();
		System.out.println("Enter your zip code");
		int zip = input.nextInt();
		System.out.println("Enter your State");
		input.nextLine();
		String state = input.nextLine();
		// print out statement to put together the mailing address
		System.out.println(aptnum + " "+ street+ ", "+ city + ", "+ state+ " "+ zip);
	}
	
}
