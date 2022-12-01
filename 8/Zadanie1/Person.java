package Zadanie1;

import java.util.Scanner;

public class Person
{
    public String LastName;
    public String FirstName;
    public String StreetName;
    public String PostalCode;
    public String City;

    public void Initialize(Scanner InputScanner)
    {
        System.out.println("Please enter your last name:");
        this.LastName = InputScanner.nextLine();
        System.out.println("Please enter your first name:");
        this.FirstName = InputScanner.nextLine();
        System.out.println("Please enter your street name:");
        this.StreetName = InputScanner.nextLine();
        System.out.println("Please enter your postal code:");
        this.PostalCode = InputScanner.nextLine();
        System.out.println("Please enter your city:");
        this.City = InputScanner.nextLine();
    }

    public void Print()
    {
        System.out.println("Last name: " + this.LastName);
        System.out.println("First name: " + this.FirstName);
        System.out.println("Street name: " + this.StreetName);
        System.out.println("Postal Code : " + this.PostalCode);
        System.out.println("City: " + this.City);
    }
}