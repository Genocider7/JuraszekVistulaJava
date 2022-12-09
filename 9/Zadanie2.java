public class Zadanie2 {
    public static int divideElement(int[] numbers, int n, int divisor)
    {
        int chosen_number = 0;
        int result = 0;
        try
        {
            chosen_number = numbers[n];
        }
        catch (ArrayIndexOutOfBoundsException array_exception)
        {
            System.out.println("Error occured: cannot access element out of bounds");
            System.out.println("Stack trace: ");
            array_exception.printStackTrace();
            System.out.println(array_exception);
            chosen_number = -2;
            divisor = 1;
        }
        finally
        {
            System.out.println("Notice: I finished trying to access array element");
        }
        try
        {
            result = chosen_number / divisor;
        }
        catch (ArithmeticException arith_exception)
        {
            System.out.println("Error occured: Cannot divide by 0");
            System.out.println("Stack trace: ");
            arith_exception.printStackTrace();
            System.out.println(arith_exception);
            result = -1;
        }
        finally
        {
            System.out.println("Notice: I finished trying to divide number");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array;
        int result;
        //ArrayOutOfBoundsException - zwraca kod błędu -2
        array = new int[5];
        array[0] = 0;
        array[1] = 3;
        array[2] = 4;
        array[3] = 5;
        array[4] = 1;
        result = divideElement(array, 7, 1);
        System.out.println("method returned " + result + "\n");
        //ArithmeticException
        array = new int[3];
        array[0] = 10;
        array[1] = 100;
        array[2] = 1000;
        result = divideElement(array, 2, 0);
        System.out.println("method returned " + result + "\n");
        //No exception
        array = new int[4];
        array[0] = 50;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        result = divideElement(array, 2, 10);
        System.out.println("method returned " + result + "\n");
        
    }
}
