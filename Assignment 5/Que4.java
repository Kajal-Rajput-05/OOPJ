
public class Que4 {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public Que4(String name, double units) {
        this.customerName = name;
        this.unitsConsumed = units;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getUnitsConsumed() {
        return this.unitsConsumed;
    }
    public double calculateBillAmount(double uc) {
        int rate1 = 5;
        int rate2 = 7;
        int rate3 = 10;
        int threshold1 = 100;
        int threshold2 = 300;

        if (uc <= threshold1) {
            billAmount = uc * rate1;
        } else if (uc <= threshold2) {
            billAmount = threshold1 * rate1 + (uc - threshold1) * rate2;
        } else
            billAmount = threshold1 * rate1 + (threshold2 - threshold1) * rate2 + (uc - threshold2) * rate3;
        
            return billAmount;
    }
    public static void main(String[] args) {
        Que4 eb = new Que4("Consumer", 136.0);
		
		double billamount=eb.calculateBillAmount(eb.getUnitsConsumed());
		
		System.out.println("Customer name: "+eb.getCustomerName());
		System.out.println("Unit consumed: "+eb.getUnitsConsumed());
		System.out.println("Bill Amount: "+billamount);
	}
}