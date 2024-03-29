import java.util.Scanner;

    class Que2 {
	private double height;
	private double weight;
	
	public void setHeight(double h) {
		this.height=h;
	}
	public void setWeight(double w) {
		this.weight=w;
	}
	public double getHeight(double h) {
		return this.height;
	}
	public double getWeight(double w) {
		return this.weight;
	}
	
	public double calculateBMI(double h,double w) {
		double res=w / (h * h);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your height: ");
		double height=sc.nextDouble();
		System.out.print("Enter your weight: ");
		double weight=sc.nextDouble();
		
		Que2 bc = new Que2();
		bc.setHeight(height);
		bc.setWeight(weight);
		double bmi=bc.calculateBMI(bc.getHeight(height),bc.getWeight(weight));
		
		System.out.println("Calucalted BMI is: "+bmi);
			
	}
}