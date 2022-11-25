import java.util.Scanner;

public class Zadanie2
{
    static float MassJuraszek = 0f;
    static float HeightJuraszek = 0f;
    static float BMIJuraszek = 0f;
    static Scanner InputScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Podaj swoja wage w kilogramach: ");
        MassJuraszek = InputScanner.nextFloat();
        System.out.print("Podaj swoj wzrost w metrach: ");
        HeightJuraszek = InputScanner.nextFloat();
        BMIJuraszek = MassJuraszek / HeightJuraszek / HeightJuraszek;
        System.out.printf("Twoje BMI to %.2f. Oznacza to ", BMIJuraszek);
        if (BMIJuraszek < 16f)
        {
            System.out.println("wyglodzenie");
        }
        else if (BMIJuraszek < 17f)
        {
            System.out.println("wychudzenie");
        }
        else if (BMIJuraszek < 18.5f)
        {
            System.out.println("niedowaga");
        }
        else if (BMIJuraszek < 23f)
        {
            System.out.println("norma, niski przedzial");
        }
        else if (BMIJuraszek < 25f)
        {
            System.out.println("norma, wysoki przedzial");
        }
        else if (BMIJuraszek < 27.5f)
        {
            System.out.println("nadwaga, niski przedzial");
        }
        else if (BMIJuraszek < 30f)
        {
            System.out.println("nadwaga, wysoki przedzial");
        }
        else if (BMIJuraszek < 35f)
        {
            System.out.println("otylosc I stopnia");
        }
        else if (BMIJuraszek < 40f)
        {
            System.out.println("otylosc II stopnia");
        }
        else
        {
            System.out.println("otylosc III stopnia");
        }
    }
}