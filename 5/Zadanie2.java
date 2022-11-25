import java.util.Random;
import java.util.Arrays;
public class Zadanie2
{
    static int[] numbers = new int[10];
    static Random RNG = new Random();
    static boolean first = true;
    static int smallest = 101;
    static int biggest = 0;
    public static void main(String[] args) 
    {
        Arrays.setAll(numbers, (index) -> RNG.nextInt(100) + 1);
        System.out.print("Array: [");
        for (int number : numbers) {
            if (first)
            {
                first = false;
            } else 
            {
                System.out.print(", ");
            }
            if (number < smallest)
            {
                smallest = number;
            }
            if (number > biggest)
            {
                biggest = number;
            }
            System.out.print(number);
        }
        System.out.println("]");
        System.out.println("Smallest number in array: " + smallest);
        System.out.println("Biggest number in array: " + biggest);
    }
}