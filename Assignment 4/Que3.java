import java.util.*;

 class Employee {
	int empid;
	String name;
	double salary;
	
	public void printDetails(int eid,String n,double sal) {
		System.out.println(eid+" | "+n+" | "+sal);
	}
	public void printDetails(int eid,String name) {
		System.out.println(eid+" | "+name+" | ");
		
	}
	public void printDetails(String name) {
		System.out.println("  | "+name+" |");
	}
		public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println("-------------------------");
		e.printDetails("ab");
		System.out.println("-------------------------");
		e.printDetails(2, "cd");
		System.out.println("-------------------------");
		e.printDetails(03,"ef", 25000);
		System.out.println("-------------------------");
		e.printDetails("gh");
		System.out.println("-------------------------");
		e.printDetails(9, "ij");
		System.out.println("-------------------------");
	}
}

//Create a class Employee with multiple overloaded methods that have different parameter types (e.g., 
//int, double, String). Demonstrate calling each overloaded method with appropriate arguments.