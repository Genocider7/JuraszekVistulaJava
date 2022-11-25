import java.util.Random;

public class Zadanie3
{
    static Random randJuraszek = new Random();
    static int generatedNumberJuraszek = 0;
    public static void main(String[] args)
    {
        generatedNumberJuraszek = randJuraszek.nextInt(101);
        System.out.println("Generated number: " + generatedNumberJuraszek);
        System.out.print("Generated number is ");
        System.out.println(generatedNumberJuraszek % 2 == 0 ? "even" : "odd");
    }
}