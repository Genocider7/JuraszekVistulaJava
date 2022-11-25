package First;
import java.util.Scanner;

public class RectangleArea
{
    public float Side1;
    public float Side2;
    public float Area;
    public RectangleArea()
    {
        Side1 = 0f;
        Side2 = 0f;
        Area = 0f;
    }
    public RectangleArea(float Side1, float Side2)
    {
        this.Side1 = Side1;
        this.Side2 = Side2;
        Area = 0f;
    }
    public void GetData(Scanner MyScanner)
    {
        System.out.print("Please enter the length of first side: ");
        Side1 = MyScanner.nextFloat();
        System.out.print("Please enter the length of second side: ");
        Side2 = MyScanner.nextFloat();
        System.out.println("Thanks");
    }
    public void CalculateArea()
    {
        Area = Side1 * Side2;
    }
    public void PrintData()
    {
        System.out.printf("This rectangle has side 1 of %.2f and side 2 of %.2f making the area %.2f\n", Side1, Side2, Area);
    }
}