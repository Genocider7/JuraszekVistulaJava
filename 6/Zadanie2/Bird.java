package Zadanie2;

public class Bird extends Animal //Birds are not real
{
    String FeatherColor;

    public String getFeatherColor() {
        return FeatherColor;
    }

    public void setFeatherColor(String featherColor) {
        FeatherColor = featherColor;
    }

    Bird()
    {
        super();
        this.FeatherColor = "";
    }

    Bird(String Name, int Age, double Weight, String FeatherColor)
    {
        super(Name, Age, Weight);
        this.FeatherColor = FeatherColor;
    }

    Bird(String Name, String FeatherColor)
    {
        super(Name, 0, 0);
        this.FeatherColor = FeatherColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", FeatherColor: %s".formatted(FeatherColor);
    }

    @Override
    public void eat() {
        System.out.println(this.Name + " eats some birdfood");
    }

    @Override
    public void getVoice() {
        System.out.println(this.Name + " chirps");
    }

    public void fly()
    {
        System.out.println(this.Name + " flies");
    }

}