public class Zadanie3
{
    static int[][] matrix = new int[10][10];
    static void matrix_init()
    {
        for (int x = 0; x < matrix.length; x++)
        {
            for (int y = 0; y < matrix[x].length; y++)
            {
                if (x == y)
                {
                    matrix[x][y] = x;
                } else 
                {
                    matrix[x][y] = 0;
                }
            }
        }
    }
    static int get_matrix_diagonal()
    {
        if (matrix.length == 0)
            return -1;
        if (matrix.length != matrix[0].length)
            return -2;
        int ret = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            ret += matrix[i][i];
        }
        return ret;
    }
    static void print_matrix(int width)
    {
        for(int y = 0; y < matrix.length; y++)
        {
            boolean first = true;
            for(int x = 0; x < matrix[y].length; x++)
            {
                if (first)
                {
                    first = false;
                } else
                {
                    System.out.print(" ");
                }
                System.out.printf("%" + width + "d", matrix[x][y]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int diagonal;
        matrix_init();
        diagonal = get_matrix_diagonal();
        System.out.println("Matrix:");
        print_matrix(1);
        switch (diagonal)
        {
            case -1:
            System.out.println("Error, matrix' length is 0");
            return;
            case -2:
            System.out.println("Erorr, matrix is not square matrix");
            return;
        }
        System.out.println("Sum of matrix' diagnoal is " + diagonal);
    }
}