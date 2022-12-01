package Zadanie2;

public class Blowflish extends Fish implements AnimalBehavior
{
    Boolean Inflated;

    public Boolean getInflated() {
        return Inflated;
    }

    public void setInflated(Boolean inflated) {
        Inflated = inflated;
    }

    Blowflish()
    {
        super();
        this.Inflated = false;
    }

    Blowflish(String Name, int Age, double Weight, Boolean SeaWater, Boolean Inflated)
    {
        super(Name, Age, Weight, SeaWater);
        this.Inflated = Inflated;
    }

    Blowflish(Boolean Inflated)
    {
        super();
        this.Inflated = Inflated;
    }

    @Override
    public String toString() {
        return super.toString() + ", Inflated: %b".formatted(this.Inflated);
    }

    @Override
    public void eat() {
        System.out.println(this.Name + " eats some algae");
    }

    @Override
    public void getVoice() {
        System.out.println(this.Name + " does some angry bulbulbul");
    }

    @Override
    public void die() {
        System.out.println(this.Name + " turned upside down and released some toxins before it passed away (?)");
    }

    public void inflate()
    {
        if (this.Inflated)
        {
            System.out.println(this.Name + " is angrily inflated");
        } else
        {
            this.Inflated = true;
            System.out.println(this.Name + " inflates angrily");
        }
    }

    @Override
    public void sleep()
    {
        System.out.println(this.Name + " sleeps after retracting its spikes");
    }

    @Override
    public void move()
    {
        System.out.println("Blowfish swims through the ocean");
    }
}