package lab4;

public class Car {
	//name, speed, distance
	private String carName;
	private double speed;
	private double distance;
	
	//set car name
	public void setName(String n) {
		carName=n;
	}
	//get car name
	public String getName() {
		return carName;
	}
	//increases speed
	public void increaseSpeed(double s) {
		//if the speed value is less than zero dont increase
		if(s>0) {
			speed+=s;
		}
	}
	//decreases speed
	public void decreaseSpeed(double s) {
		//if decrease would not create a neg subtract
		if(speed-s >=0) {
			speed= speed-s;
		}
		//else if would be neg set to zero
		else
			speed = 0;
	}
	//returns speed
	public double getSpeed() {
		return speed;
	}
	//sets the time to calculate distance
	public void setTime(double time) {
		distance = (time * speed) + distance;
	}
	//returns the distance
	public double getDistance() {
		return distance;
	}
	
}
