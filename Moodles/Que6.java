import java.util.Scanner;
 class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        //write your logic here
         if (input > 0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
        
    }
}