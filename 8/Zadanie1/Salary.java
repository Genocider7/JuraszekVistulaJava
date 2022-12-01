package Zadanie1;

public interface Salary {
    public double salaryToPay(double wage, double workedHours); //We have to override this

    default public double salaryForOvertime(double wage, double overtimeHours) //We can override this
    {
        if (overtimeHours <= 0)
        {
            return 0;
        }
        return wage * overtimeHours;
    }
    
    static public boolean IfBonus(double yearsOfExperience) //We cannot override this
    {
        return yearsOfExperience >= 2;
    }
}
