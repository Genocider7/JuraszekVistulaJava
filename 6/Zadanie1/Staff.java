package Zadanie1;

import java.util.Scanner;

public class Staff extends Person
{
    public String Education;
    public String Position;

    public void Initialize1(Scanner InputScanner)
    {
        super.Initialize(InputScanner);
        System.out.println("Please enter your education:");
        this.Education = InputScanner.nextLine();
        System.out.println("Please enter your position:");
        this.Position = InputScanner.nextLine();
    }

    public void Print1()
    {
        super.Print();
        System.out.println("Education: " + this.Education);
        System.out.println("Position: " + this.Position);
    }
}