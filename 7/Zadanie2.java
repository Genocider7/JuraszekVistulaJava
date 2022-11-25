public class Zadanie2
{
    public static final int size = 10;
    public static int[] numbers;
    public static int minimum;
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
        minimum = 0;
        System.out.println("Array:\n" + arrayToString(numbers));
        for (int i=1; i<numbers.length; i++)
        {
            if (numbers[i] < numbers[minimum])
            {
                minimum = i;
            }
        }
        System.out.println("Smallest number is at position :\n" + minimum);
    }
}