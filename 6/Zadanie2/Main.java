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

        AnimalRoster[2].getVoice();
        AnimalRoster[4].getVoice();
    }
}