import java.util.Scanner;
public class Que5 {
       public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("  ");
        String input = in.next().toLowerCase();

        boolean vowels = input.equals("a, A") || input.equals("e, E") || input.equals("i,I") || input.equals("o,O") || input.equals("u, U");

        if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}