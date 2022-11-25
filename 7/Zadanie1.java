public class Zadanie1
{
    public static final int size = 10;
    public static int[] numbers;
    public static int helper;
    public static String arrayToString(int[] arr)
    {
        String ret = "[";
        boolean first = true;
        for(int i=0; i<arr.length; i++)
        {
            if (first)
            {
                first = false;
            } else
            {
                ret += ", ";
            }
            ret += Integer.toString(arr[i]);
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) 
    {
        numbers = new int[size];
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = numbers.length - i;
        }
        System.out.println("Before loop:\n" + arrayToString(numbers));
        for(int i=1; i<numbers.length; i++)
        {
            if (numbers[i-1] > numbers[i])
            {
                helper = numbers[i-1];
                numbers[i-1] = numbers[i];
                numbers[i] = helper;
            }
        }
        System.out.println("After loop:\n" + arrayToString(numbers));
    }
}