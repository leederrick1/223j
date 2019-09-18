/*
 * Derrick Lee
 * 9/12/19
 * Lab 4 : classes
 * This program takes has a car object that lets you increase and decrease speed and gives you distance based off time.
 */

package lab4;

public class lab4main {

	public static void main(String[] args) {
		//create new care object
		Car honda = new Car();
		//set private variables using setters
		honda.setName("Tom");
		honda.increaseSpeed(0);
		honda.setTime(0);
		//prints out distance using getters
		System.out.println(honda.getName()+" has a current speed of "+honda.getSpeed() +" and has gone a distance of "+ honda.getDistance());
		honda.increaseSpeed(50);
		honda.setTime(1.5);
		System.out.println(honda.getName()+" has a current speed of "+honda.getSpeed() +" and has gone a distance of "+ honda.getDistance());
		//continues to add on to distance
		honda.decreaseSpeed(15);
		honda.setTime(1);
		System.out.println(honda.getName()+" has a current speed of "+honda.getSpeed() +" and has gone a distance of "+ honda.getDistance());
		
		
	}

}
