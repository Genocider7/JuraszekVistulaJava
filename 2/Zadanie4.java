import java.util.Random;

public class Zadanie4
{
    static Random randJuraszek = new Random();
    static int amountOfBricksJuraszek = 0;
    static int containerCapacityJuraszek = 0;
    public static void main(String[] args)
    {
        amountOfBricksJuraszek = 2 * randJuraszek.nextInt(25) + 51;
        containerCapacityJuraszek = 2  * randJuraszek.nextInt(3) + 6; 
        System.out.println("Generated " + amountOfBricksJuraszek + " bricks and each container can fit " + containerCapacityJuraszek + " bricks.");
        System.out.println("Filled " + amountOfBricksJuraszek / containerCapacityJuraszek + " containers");
        switch (amountOfBricksJuraszek % containerCapacityJuraszek)
        {
            case 0:
            System.out.println("There are no bricks left");
            break;
            case 1:
            System.out.println("There is 1 brick left");
            break;
            default:
            System.out.println("There are " + amountOfBricksJuraszek % containerCapacityJuraszek + " bricks left");
            break;
        }
    }
}