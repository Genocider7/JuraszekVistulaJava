package First;
import java.util.Scanner;

public class Main
{
    static Scanner myScanner = new Scanner(System.in);
    static RectangleArea rect1 = new RectangleArea();
    public static void main(String[] args)
    {
        rect1.GetData(myScanner);
        rect1.CalculateArea();
        rect1.PrintData();
    }
}