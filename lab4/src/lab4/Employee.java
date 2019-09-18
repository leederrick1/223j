package lab4;
//static mean it doesnt need an object to work
public class Employee {
	private String empName;
	private int id;
	//class are public by default
	public void setEmpName(String n) {
		empName = n;
	}
	public String getEmpName() {
		return empName;
	}
	public void setID(int i) {
		id = i;
	}
	public int getID() {
		return id;
	}
	public int pay(int hours, int baseRate) {
		return hours*baseRate;
	}
}
