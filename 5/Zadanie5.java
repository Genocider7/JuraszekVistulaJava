import java.util.Scanner;
public class Zadanie5
{
    static Scanner InputScanner = new Scanner(System.in);
    static String Input;
    static String lower(String string)
    {
        String ret = "";
        for (int i = 0; i < string.length(); i++)
        {
            char current = string.charAt(i);
            if (current >= 'A' && current <= 'Z')
            {
                ret += (char)(current - 'A' + 'a');
            }
            else
            {
                ret += current;
            }
        }
        return ret;
    }
    static boolean if_palindrome(String word)
    {
        char first;
        char last;
        for(int i=0; i < word.length()/2; i++)
        {
            first = word.charAt(i);
            last = word.charAt(word.length() - i - 1);
            if (first != last)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Please enter word or sentence to check: ");
        Input = InputScanner.nextLine();
        Input = lower(Input);
        if (if_palindrome(Input))
        {
            System.out.println("Word or sentence is a palindrome.");
        }
        else
        {
            System.out.println("Word or sentence is not a palindrome");
        }
    }
}