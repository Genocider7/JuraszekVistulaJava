package Zadanie2;

public class Pigeon extends Bird implements AnimalBehavior
{
    String Personality;

    public String getPersonality() {
        return Personality;
    }

    public void setPersonality(String personality) {
        Personality = personality;
    }

    Pigeon()
    {
        super();
        this.Personality = "";
    }

    Pigeon(String Name, int Age, double Weight, String FeatherColor, String Personality)
    {
        super(Name, Age, Weight, FeatherColor);
        this.Personality = Personality;
    }

    Pigeon(int Age, double Weight, String Personality)
    {
        super("", Age, Weight, "");
        this.Personality = Personality;
    }

    @Override
    public String toString() {
        return super.toString() + ", Personality: %s".formatted(this.Personality);
    }

    @Override
    public void eat() {
        System.out.println(this.Name + " eats some crumbs");
    }

    @Override
    public void getVoice() {
        System.out.println(this.Name + " chirps while pooping on cars");
    }

    @Override
    public void fly() {
        System.out.println(this.Name + " flies disgracefully");
    }

    public void flapWings()
    {
        System.out.println(this.Name + " flaps its wings");
    }

    @Override
    public void sleep()
    {
        System.out.println(this.Name + " sleeps in its nest");
    }

    @Override
    public void move()
    {
        System.out.println("Pigeon flies through the sky");
    }
}