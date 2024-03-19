import java.util.*;
 class Vehicle {
	String make;
	String model;
	int year;
	long price;
	
	public Vehicle(String make, String model, int y, int p) {
		this.model=model;
		this.year=y;
		this.price=p;
	}
	
	public void printDetails() {
		System.out.println("Model   "+" "+"year "+" "+"Price	");
		System.out.println(this.model+" "+this.year+"  "+this.price);
	}	
	public void printDetails(String model,int y,long p) {
		this.model=model;
		this.year=y;
		this.price=p;
		System.out.println(this.model+" "+this.year+"  "+this.price);
	}

	public void printDetails(String model,long p) {
		this.model=model;
		this.price=p;
		System.out.println(this.model+" "+this.year+"  "+this.price);
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle("Honda","Honda-ab",2024,940000);
		
		v.printDetails();
		v.printDetails("Honda-pq",2022,15000);
		v.printDetails("Honda-xy",45000);
		
	}
}