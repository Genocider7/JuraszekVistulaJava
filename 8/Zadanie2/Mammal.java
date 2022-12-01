package Zadanie2;

public class Mammal extends Animal
{
    String Area;

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    Mammal()
    {
        super();
        this.Area = "";
    }

    Mammal(String Name, int Age, double Weight, String Area)
    {
        super(Name, Age, Weight);
        this.Area = Area;
    }

    Mammal(String Name, int Age)
    {
        this(Name, Age, 0, "");
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: %s".formatted(this.Area);
    }

    @Override
    public void eat()
    {
        System.out.println(this.Name + " eats some mammal food");
    }

    @Override
    public void getVoice()
    {
        System.out.println(this.Name + " makes some mammal sound");
    }

    public void feedBabiesMilk()
    {
        System.out.println(this.Name + " feeds its babies milk cause it's a mammal I guess");
    }
}