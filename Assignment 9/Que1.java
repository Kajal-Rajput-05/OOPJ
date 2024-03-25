
public class Que1 {
    public static void main(final String[] args) {
        try {
            int num = 0;
            if (num == 0)
                throw new ArithmeticException();
            System.out.println("Non Zero Number");
        } catch (final ArithmeticException ex) {
            ex.printStackTrace();
        }
    }
}