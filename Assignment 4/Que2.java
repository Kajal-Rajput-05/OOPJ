package com.java;
class Vehicle { 
	String color;
	int NT;
	int ND;
	int NoOfTyre(String color, int NT) {
		this.color=color;
		this.NT=NT;
		System.out.println(this.color+" "+this.NT);
		return 0;
	}
	int NoOfTyre(String color, int NT, int ND) {
		this.color=color;
		this.NT=NT;
		this.ND=ND;
		System.out.println(this.color+" "+this.NT+" "+this.ND);
		return 0;
	}	
}
 class Oop3 {
	public static void main(String[] args) {	
        Vehicle Vh= new Vehicle();
        Vh.NoOfTyre("red",3);
        Vh.NoOfTyre("red",3,6);
	}
} 
//a Vehicle class with overloaded methods that have a different number of parameters. 
//Demonstrate calling these overloaded methods with various numbers of arguments.  