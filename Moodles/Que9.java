import java.util.Scanner;
class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        //Write your logic here
        if(x==y){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}