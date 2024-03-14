import java.util.Scanner;
 class Exercise{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  int num2 = in.nextInt();
  int num3 = in.nextInt();
  //Write your logic here
  double avg;
  avg = ((num1+num2+num3)/3);
  System.out.println(avg);
  
 }
} 