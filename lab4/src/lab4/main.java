package lab4;

public class main {

	public static void print() {
		System.out.println("inside the function");
	}
	public static void main(String[] args) {
		//you dont need to prototype in java
		//you dont have to deal with pointers in java
		print();
		Employee clerk = new Employee();
		clerk.setEmpName("Timmy");
		System.out.println("His name was "+clerk.getEmpName());
		clerk.setID(777);
		System.out.println("The cwid is "+clerk.getID());
	}

}
