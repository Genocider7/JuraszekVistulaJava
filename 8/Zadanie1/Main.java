package Zadanie1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Staff Jeremy = new Staff();
        Jeremy.Initialize1(new Scanner(System.in));
        Jeremy.Print();
        System.out.println(Jeremy.FirstName + "'s salary: " + Jeremy.salaryToPay(30, 160));
        System.out.println(Jeremy.FirstName + "'s overtime salary: " + Jeremy.salaryForOvertime(30, 20));
        System.out.println("Does " + Jeremy.FirstName + " get a bonus? " + (Salary.IfBonus(1) ? "Yes" : "No"));
    }
}