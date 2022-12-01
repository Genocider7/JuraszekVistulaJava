package Zadanie2;

public interface AnimalMove {
    default void move()
    {
        System.out.println(this.getClass().getSimpleName() + " moves");
    }
}
