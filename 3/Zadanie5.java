import java.util.Random;

public class Zadanie5
{
    static Random randomJuraszek = new Random();
    static int[] randomNumbersJuraszek = new int[10];
    static int smallestJuraszek = 101;
    static int biggestJuraszek = 0;
    static int iterJuraszek = 0;
    static int currentJuraszek = 0;
    static boolean firstJuraszek = true;
    public static void main(String[] args)
    {
        System.out.println("Generated numbers:");
        for(int i=0; i<10; i++)
        {
            if(firstJuraszek)
            {
                firstJuraszek = false;
            }
            else
            {
                System.out.print(", ");
            }
            randomNumbersJuraszek[i] = randomJuraszek.nextInt(100) + 1;
            System.out.print(randomNumbersJuraszek[i]);
        }
        iterJuraszek = 0;
        while(iterJuraszek < 10)
        {
            currentJuraszek = randomNumbersJuraszek[iterJuraszek++];
            if (currentJuraszek < smallestJuraszek)
            {
                smallestJuraszek = currentJuraszek;
            }
            if (currentJuraszek > biggestJuraszek)
            {
                biggestJuraszek = currentJuraszek;
            }
        }
        System.out.println("\n\nSmallest number: " + smallestJuraszek);
        System.out.println("Biggest number: " + biggestJuraszek);
    }
}