package second;
import java.awt.*;

public class Main
{
    static Car myHondaCar = new Car("Fast", "Honda", 2030, 50000f, Color.MAGENTA, 4);
    public static void main(String[] args) {
        System.out.println(myHondaCar.toString());
        myHondaCar.sell(2);
        System.out.println(myHondaCar.getModel());
        System.out.println(myHondaCar.getBrand());
        System.out.println(myHondaCar.getYear());
        System.out.println(myHondaCar.getPrice());
        System.out.println(myHondaCar.getColor());
        System.out.println(myHondaCar.getQuantity());
        myHondaCar.setPrice(0.01f);
        System.out.println(myHondaCar.toString());
    }
}