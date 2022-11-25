public class Zadanie4
{
    static int SumJuraszek = 0;
    public static void main(String[] args)
    {
        for(int i=2; i<=100; i+=2)
        {
            SumJuraszek += i;
        }
        System.out.println("Sum of all even numbers from 0 to 100 is " + SumJuraszek);
    }
}