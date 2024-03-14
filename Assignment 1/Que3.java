import java.util.*;
public class Que3 {
    public static void main(String[] args){
    Double num1, num2, result;
    char arithmatic;
     Scanner in = new Scanner(System.in);
    
     System.out.println("Enter first number");
     num1 = in.nextDouble();
 
     System.out.println("Enter second number");
     num2 = in.nextDouble();
         
     System.out.println("Choose an arithmatic: +, -, *, /");
     arithmatic = in.next().charAt(0);

     switch (arithmatic) {
        case '+':
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;

          case '-':
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
          break;
          
          case '*':
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
          break;
          
          case '/':
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);
          break;
          default:
          System.out.println("Choose correct one....");
       
     }
    
    }

}