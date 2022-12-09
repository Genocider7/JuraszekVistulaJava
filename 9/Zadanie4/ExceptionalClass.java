package Zadanie4;

public class ExceptionalClass {
    static int[] ids = {0,2,4,6,8,10};
    public static void CheckId(int id, String reason) throws NoIdException, OddException, EmptyStringException
    {
        if (id % 2 == 1)
        {
            throw new OddException("Given id is odd. Ids can only be even");
        }
        if (reason.length() == 0)
        {
            throw new EmptyStringException("Reason can't be empty");
        }
        for (int internal_id : ids)
        {
            if (internal_id == id)
            {
                return;
            }
        }
        throw new NoIdException();
    }
}
