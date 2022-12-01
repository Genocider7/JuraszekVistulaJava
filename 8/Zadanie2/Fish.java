package Zadanie2;

public class Fish extends Animal
{
    Boolean SeaWater;

    public void setSeaWater(Boolean seaWater) {
        SeaWater = seaWater;
    }

    public Boolean getSeaWater() {
        return SeaWater;
    }

    Fish()
    {
        super();
        this.SeaWater = false;
    }

    Fish(String Name, int Age, double Weight, Boolean SeaWater)
    {
        super(Name, Age, Weight);
        this.SeaWater = SeaWater;
    }

    Fish(String Name, double Weight)
    {
        super(Name, 0, Weight);
    }

    @Override
    public String toString() {
        return super.toString() + ", SeaWater: %b".formatted(SeaWater);
    }

    @Override
    public void eat()
    {
        System.out.println(this.Name + " eats some fishfood");
    }

    @Override
    public void getVoice() {
        System.out.println(this.Name + " does bulbulbul");
    }

    public void die()
    {
        System.out.println(this.Name + " turned upside-down and is... taking a nap");
    }
}