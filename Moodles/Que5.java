import java.util.Scanner;
 class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        //Write your logic here
         System.out.println(n1 > 0  &&  n1 < 1  &&  n2 > 0  &&  n2 < 1);
    }
} 