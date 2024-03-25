
public class Que2 {
    public static void main( String[] args) {
        try{
            int num=5;
            if(num%2==1)
                throw new ArithmeticException();
            System.out.println("Even Number");
        }catch (final ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}