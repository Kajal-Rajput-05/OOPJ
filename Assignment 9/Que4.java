
public class Que4 {
    public static void main( String[] args) {
        try{
            int num=59;
            if(num>10)
            
            throw new ArithmeticException();
            System.out.println("One Digit Number");
        }
        catch (final NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Number1");
        }
        catch (final NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Number2");
        }
        catch (final ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Number3");
        }
    }
}
