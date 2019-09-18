/*
 * java virtual machine jvm allows java to be cross platform
 * one main per project
 * everything in java is a class. must start with a capital letter class names should be a capital letter
 * class names(identifier) cannot start with a number
 * public is an access specifier
 */

import java.util.Scanner;
public class io {
	/*
	 * public is an access specifier 
	 * static mean this function will work without instancating the object
	 */
	public static void main(String [] args ){
		System.out.println("hello world");
		
	    Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age?");
		
		int age =input.nextInt();
		
		System.out.println("You are " + age);
		
		System.out.println("What is your favorite number?");
		int fav = input.nextInt();
		System.out.println("your favorites number is "+fav);
		/*
		 * next() reads until whitespace and saves data as string
		 * nextline reads until the new line char// getline()
		 * nextInt()
		 * hasNext()
		 */
		System.out.println("please enter the base.");
		double base = input.nextDouble();
		System.out.println("Please enter the height");
		double height = input.nextDouble();
		double hypotenuse;
		//This formula computes the hypotensue of a triangle
		hypotenuse= Math.sqrt(Math.pow(height, 2)+ Math.pow(base, 2));
		System.out.println("This is the hypotenuse "+ hypotenuse);
		
		System.out.println("What is your name?");
		String name;
		input.nextLine();
		name=input.nextLine();
		System.out.println("Hello "+name);
		/*
		 * use nextLine() to clear number data before a string
		 */
	}

}
