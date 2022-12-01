package Zadanie1;

public interface Salary {
    double salaryToPay(double wage, double workedHours); //We have to override this

    default double salaryForOvertime(double wage, double overtimeHours) //We can override this
    {
        if (overtimeHours <= 0)
        {
            return 0;
        }
        return wage * overtimeHours;
    }
    
    static boolean IfBonus(double yearsOfExperience) //We cannot override this
    {
        return yearsOfExperience >= 2;
    }
}
