import java.util.Scanner;
 class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        //Write your logic here
        if(year % 4 == 0){
        System.out.println(year + " Leap Year");
    }
    else {
        System.out.println(year + " Not Leap Year");
    }
        
    }
}