package virtualpet;

public class VirtualPet {
	//statistics of the class
	private int age;
	private String name;
	private int cleanliness;
	private int happiness;
	private int hunger;
	private int health;
	
	//construct that randomly generates stats and sets the name
	public VirtualPet(String n) {
		name = n;
		cleanliness=(int)(Math.random()*10)+1;
		happiness=(int)(Math.random()*10)+1;
		hunger=(int)(Math.random()*10)+1;
		health=(int)(Math.random()*10)+1;
		age=0;
	}
	//based on the number chosen will select a string return function
	public void choice(int num) {
		int choice=num;
		age++; // since an action will happen increment age
		switch(choice){
		case 1: System.out.println(feed());
		break;//feed
		case 2: System.out.println(wash());
		break;//wash
		case 3: System.out.println(play());
		break;//play
		case 4: System.out.println(health());
		break;//health
		}
	}
	public String feed() { // rolls a random number to choose a different statement 
		int roll=(int)(Math.random()*2)+1;
		String msg="";
		hunger++;//increase hunger by 1
		if (roll==1)
			msg= name+ " ate a seed.";
		else
			msg= name+ " ate some corn.";
		return msg;
	}
	public String wash() {// rolls a random number to choose a different statement 
		int roll=(int)(Math.random()*2)+1;
		String msg="";
		cleanliness++;
		if (roll==1)
			msg= name+ " got a bath.";
		else
			msg= name+ " pecks off bugs.";
		return msg;
	}
	public String play() {// rolls a random number to choose a different statement 
		int roll=(int)(Math.random()*2)+1;
		String msg="";
		happiness++;//increments happiness by 1
		if (roll==1)
			msg= name+ " plays with a spider.";
		else
			msg= name+ " flys around the coop.";
		return msg;
	}
	public String health() {// rolls a random number to choose a different statement 
		int roll=(int)(Math.random()*2)+1; //roll will either be 1 or 2
		String msg="";
		health++;//increments health
		if (roll==1)
			msg= name+ " stops drinking radioactive water.";
		else
			msg= name+ " gets moved into a bigger pen.";
		return msg;
	}
	
	//all of the getters for the class
	public int getClean() {
		return cleanliness;
	}
	public int getHappy() {
		return happiness;
	}
	public int getHunger() {
		return hunger;
	}
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
