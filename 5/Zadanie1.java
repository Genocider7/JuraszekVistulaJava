public class Zadanie1
{
    static int[] array = new int[10];
    public static void main(String[] args) 
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 9 - i;
        }
        for (int element : array) {
            System.out.println("array[" + array[element] + "] = " + element);
        }
    }
}