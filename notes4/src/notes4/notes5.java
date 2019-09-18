package notes4;

public class notes5 {
	private double gpa;
	private final int CWID=1234;
	
	//constructor
	public notes5(double gpa) {
		//this helps distingush between the local gpa and parameter
		this.gpa=gpa;
	}
	public void showStudent() {
		System.out.println("CWID is "+ CWID);
	}
	public static void gpa(double gpa) {
		
	}
	//static makes things independent of the class
	
	
}
