package Com.java;

class Employee{
	public void acceptRecord(String name, int Salary) {
		
		System.out.println(name+" "+Salary);
	}
	public void acceptRecord(String name, int Salary, int Emid) {
		
		System.out.println(name+" "+Salary+" "+Emid);
	}
}
 class OOPDay1 {
	public static void main(String[] args) {
    Employee Em = new Employee();
    Em.acceptRecord("ROhan",12);
    Em.acceptRecord("Pushpak",12,17);
	}
}
//Create a class Employee with multiple overloaded methods that have different parameter types (e.g., 
//int, double, String). Demonstrate calling each overloaded method with appropriate arguments.