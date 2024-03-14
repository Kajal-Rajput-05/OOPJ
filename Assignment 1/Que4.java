import java.util.Scanner;
 class Que4{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        //Write your logic here
        switch (day) {
            case 1: 
            System.out.println ("Monday");
            break;
            case 2:
            System.out.println ("Tueday");
            break;
            case 3:
            System.out.println ("Wednesday");
            break;
            case 4:
            System.out.println ("Thurday");
            break;
            case 5:
            System.out.println ("Friday"); 
            break;
            case 6:
            System.out.println ("Satday");
            break;
            case 7:
            System.out.println ("Sunday");
            break;
        }
    }
}