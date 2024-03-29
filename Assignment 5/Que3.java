import java.util.Scanner;

public class Que3 {
	private String title="Atomic Habits";
	private String author="James Clear";
	private String publisher="Random House Business";
	private String isbn="1847941834";
	private int year=2018;
	private double price=799.00;
	private int quantity=5;
	
	public Que3() {
		
	}
	public void setQuantity(int a) {
		this.quantity=a;
	}
	private double getPrice() {
		return this.price;
	}
	private int getQuantity() {
		return this.quantity;
	}
	
	public  int increaseQuantity(int quantity ) {
		this.quantity+=quantity;
		return this.quantity;
	}
	
	public  int decreaseQuantity(int quantity) {
		this.quantity-=quantity;
		return this.quantity;
	}
	public  double getInventoryValue(double p,int q) {
		double res=p*q;
		return res;
	}
	public static int printMenu() {
		System.out.println("1.To add book Quantity \n2.To reduce book Quantity \n3.To calculate Inventory total value");
		System.out.print("Enter choice: ");
		int ch=sc.nextInt();
		return ch;
	}
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Que3 b=new Que3();
		
		switch(Que3.printMenu()) {
			case 1:
				System.out.println("Enter a quantity: ");
				int q=sc.nextInt();
				int aq=b.increaseQuantity(q);
				System.out.println("Updated quantity of book is: "+aq);
				break;
			case 2:
				System.out.println("Enter a quantity: ");
				int qty=sc.nextInt();
				int sq=b.decreaseQuantity(qty);
				System.out.println("Updated quantity of book is: "+sq);
				break;
			case 3:
				double total=b.getInventoryValue(b.getPrice(),b.getQuantity());
				System.out.println("Inventory total: "+total);
				break;
		}
		
	}
}