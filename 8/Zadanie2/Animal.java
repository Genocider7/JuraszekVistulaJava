package Zadanie2;

public abstract class Animal implements AnimalMove
{
    String Name;
    int Age;
    double Weight;

    Animal()
    {
        this.Name = "";
        this.Age = 0;
        this.Weight = 0;
    }

    Animal(String Name, int Age, double Weight)
    {
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }

    Animal(String Name)
    {
        this(Name, 0, 0);
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public double getWeight() {
        return Weight;
    }

    @Override
    public String toString() {
        return "Name: %s, Age: %d, Weight: %d".formatted(this.Name, this.Age, this.Weight);
    }

    public void eat()
    {
        System.out.println(this.Name + " eats some food");
    }

    public void getVoice()
    {
        System.out.println(this.Name + " makes some sound");
    }
}
