public class Zadanie1
{
    public static final int size = 10;
    public static int[] numbers;
    public static int helper;
    public static int operation_count;
    public static boolean did_operations;
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
        operation_count = 0;
        for(int i=0; i<numbers.length; i++)
        {
            // numbers[i] = numbers.length - i;
            numbers[i] = i+1;
        }
        System.out.println("Before loop:\n" + arrayToString(numbers));
        for (int i=1; i<numbers.length; i++)
        {
            did_operations = false;
            operation_count++;
            for (int j=0; j<numbers.length - i; j++)
            {
                operation_count++;
                if (numbers[j] > numbers[j + 1])
                {
                    helper = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = helper;
                    operation_count++;
                    did_operations = true;
                }
            }
            if (!did_operations)
            {
                break;
            }
        }
        System.out.println("After loop:\n" + arrayToString(numbers));
        System.out.println("Number of operations: " + operation_count);
    }
}