package Zadanie2;

public class Dog extends Mammal implements AnimalBehavior
{
    String Breed;

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getBreed() {
        return Breed;
    }

    Dog()
    {
        super();
        this.Breed = "";
    }

    Dog(String Name, int Age, double Weight, String Area, String Breed)
    {
        super(Name, Age, Weight, Area);
        this.Breed = Breed;
    }

    Dog(String Breed)
    {
        super();
        this.Breed = Breed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: %s".formatted(this.Breed);
    }

    @Override
    public void eat()
    {
        System.out.println(this.Name + " eats some doog food");
    }

    @Override
    public void getVoice()
    {
        System.out.println(this.Name + " barks");
    }

    @Override
    public void feedBabiesMilk()
    {
        System.out.println(this.Name + " feeds its puppies milk");
    }

    public void doATrick()
    {
        System.out.println(this.Name + " performs an amazing trick");
    }

    @Override
    public void sleep()
    {
        System.out.println(this.Name + " curls into a ball and sleeps");
    }

    @Override
    public void move()
    {
        System.out.println("Dog runs on its paws");
    }
}