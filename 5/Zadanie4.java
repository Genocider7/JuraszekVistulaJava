import java.util.Scanner;
public class Zadanie4
{
    static Scanner InputScanner = new Scanner(System.in);
    static String firstInput;
    static String secondInput;
    static String Combined1;
    static String Combined2;
    public static void main(String[] args) {
        System.out.print("Please enter first string: ");
        firstInput = InputScanner.nextLine();
        System.out.print("Please enter second string: ");
        secondInput = InputScanner.nextLine();
        Combined1 = firstInput + secondInput;
        Combined2 = secondInput + firstInput;
        System.out.println("First combined with the second: " + Combined1);
        System.out.println("Second combined with the first: " + Combined2);
        if (Combined1.equals(Combined2))
        {
            System.out.println("The combined strings are commutative");
        }
        else
        {
            System.out.println("The combined strings are not commutative");
        }
    }
}