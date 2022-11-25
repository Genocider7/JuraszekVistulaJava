import java.util.Scanner;

public class Zadanie3
{
    static float aJuraszek = 0f;
    static float bJuraszek = 0f;
    static float cJuraszek = 0f;
    static float deltaJuraszek = 0f;
    static Scanner InputScannerJuraszek = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter coefficients:");
        System.out.print("a=");
        aJuraszek = InputScannerJuraszek.nextFloat();
        System.out.print("b=");
        bJuraszek = InputScannerJuraszek.nextFloat();
        System.out.print("c=");
        cJuraszek = InputScannerJuraszek.nextFloat();
        System.out.print("\n");
        if (aJuraszek == 0f && bJuraszek != 0f)
        {
            System.out.printf("Linear case, x=%.2f\n", -1 * cJuraszek / bJuraszek);
            return;
        }
        if (aJuraszek == 0f && bJuraszek == 0f)
        {
            if (cJuraszek == 0)
            {
                System.out.println("\"Zeroth\" case - x can be any number");
            }
            else
            {
                System.out.println("No real or complex solutions");
            }
            return;
        }
        deltaJuraszek = bJuraszek * bJuraszek - 4 * aJuraszek * cJuraszek;
        if (deltaJuraszek == 0f)
        {
            System.out.printf("One real solution: x=%.2f\n",  -0.5f * bJuraszek / aJuraszek);
            return;
        }
        if (deltaJuraszek > 0f)
        {
            System.out.printf("Two real solutions: \nx1=%.2f\nx2=%.2f",
            (float)((Math.pow(deltaJuraszek, 0.5) - bJuraszek) / 2f / aJuraszek),
            (float)((Math.pow(deltaJuraszek, 0.5) + bJuraszek) / -2f / aJuraszek));
            return;
        }
        System.out.println("No real solutions\nComplex solutions:");
        if (aJuraszek > 0)
        {
            System.out.printf("x1=%.2f+%.2fi\n", -1 * bJuraszek / 2 / aJuraszek, (float)Math.pow(-1 * deltaJuraszek, 0.5) / 2 / aJuraszek);
            System.out.printf("x1=%.2f-%.2fi\n", -1 * bJuraszek / 2 / aJuraszek, (float)Math.pow(-1 * deltaJuraszek, 0.5) / 2 / aJuraszek);
            return;
        }
        System.out.printf("x1=%.2f-%.2fi\n", -1 * bJuraszek / 2 / aJuraszek, (float)Math.pow(-1 * deltaJuraszek, 0.5) / -2 / aJuraszek);
        System.out.printf("x1=%.2f+%.2fi\n", -1 * bJuraszek / 2 / aJuraszek, (float)Math.pow(-1 * deltaJuraszek, 0.5) / -2 / aJuraszek);        
    }
}