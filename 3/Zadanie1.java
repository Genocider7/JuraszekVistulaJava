import java.util.Scanner;

public class Zadanie1
{
    static float Input1Juraszek = 0f;
    static float Input2Juraszek = 0f;
    static Scanner InputScannerJuraszek = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers:");
        Input1Juraszek = InputScannerJuraszek.nextFloat();
        Input2Juraszek = InputScannerJuraszek.nextFloat();
        System.out.printf("Sum: %.2f\n", (Input1Juraszek + Input2Juraszek));
        System.out.printf("Difference: %.2f\n", (Input1Juraszek - Input2Juraszek));
        System.out.printf("Product: %.2f\n", (Input1Juraszek * Input2Juraszek));
        if (Input2Juraszek == 0)
        {
            System.out.println("Quotient: -");
        }
        else
        {
            System.out.printf("Quotient: %.2f\n", Input1Juraszek / Input2Juraszek);
        }
    }
}