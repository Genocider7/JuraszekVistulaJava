package Zadanie2;

public class Main
{
    public static void main(String[] args) {
        Animal[] AnimalRoster = new Animal[6];

        //AnimalRoster[0] = new Animal("Bob", 3, 9);
        AnimalRoster[0] = new Mammal("Jerry", 4, 62.5, "Forests");
        AnimalRoster[1] = new Dog("Tom", 1, 55.2, "House", "Kundlebury");
        AnimalRoster[2] = new Fish("Agatha", 0, 0.12, false);
        AnimalRoster[3] = new Blowflish("Peter", 1, 0.23, true, false);
        AnimalRoster[4] = new Bird("Chris", 1, 0.15, "Blue");
        AnimalRoster[5] = new Pigeon("Norman", 1, 0.12, "Gray", "Mean guy");

        AnimalBehavior[] LowestHierarchy = new AnimalBehavior[3];
        LowestHierarchy[0] = new Dog("Simon", 2, 90.2, "Garden", "Golden Retriever");
        LowestHierarchy[1] = new Blowflish("Jeff", 0, 0.02, false, true);
        LowestHierarchy[2] = new Pigeon("Kamil", 1, 0.30, "White", "Badass");

        System.out.println("Sleeping:");

        for (AnimalBehavior animal : LowestHierarchy)
        {
            animal.sleep();
        }
        
        System.out.println("\nMoving:");

        for (Animal animal : AnimalRoster)
        {
            animal.move();
        }

        System.out.println("\nGetting their names:");

        for (Animal animal : AnimalRoster)
        {
            AnimalName.name(animal.getName());
        }
    }
}