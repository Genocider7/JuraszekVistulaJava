package Zadanie4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String reason;
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Please enter id:");
        id = consoleScanner.nextInt();
        System.out.println("please enter reason for check:");
        reason = consoleScanner.next().trim();
        try
        {
            ExceptionalClass.CheckId(id,reason);
        }
        catch (NoIdException | EmptyStringException | OddException e)
        {
            e.printStackTrace();
        }
        consoleScanner.close();
    }
}
