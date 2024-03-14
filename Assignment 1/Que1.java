import java.util.Scanner;
class Que1{
    public static void main(String args[]){
        char Grade;
        float mark;
        final Scanner Mark = new Scanner(System.in);
System.out.println("Enter mark : ");
mark = Mark.nextFloat();

    if(mark>=80){
        Grade = 'A';
        }
        else if(mark>=60){
        Grade = 'B';
        }
        else if(mark>=40){
        Grade = 'C';
        }
        else {
        Grade = 'F';
        }
      System.out.println("Your Grade is " + Grade);
    }
}