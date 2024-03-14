import java.util.Scanner;
 class Exercise{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        //Write your logic here
         if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println(" Equal");
        } else {
            System.out.println(" Not Equal");
        }
    }
    } 