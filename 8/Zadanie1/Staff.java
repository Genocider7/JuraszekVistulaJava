package Zadanie1;

import java.util.Scanner;

public class Staff extends Person implements Salary
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

    @Override
    public double salaryToPay(double wage, double workedHours)
    {
        return wage * workedHours;
    }

    @Override
    public double salaryForOvertime(double wage, double overtimeHours)
    {
        return wage * overtimeHours * 1.2;
    }
}