package Zadanie3;

public class NotEnoughMoneyException extends Exception
{
    public NotEnoughMoneyException(String errString)
    {
        super(errString);
    }
    public NotEnoughMoneyException(String errString, Throwable err)
    {
        super(errString, err);
    }
}
