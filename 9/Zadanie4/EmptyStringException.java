package Zadanie4;

public class EmptyStringException extends Exception {
    public EmptyStringException()
    {
        super("Your string is empty");
    }
    public EmptyStringException(String errString)
    {
        super(errString);
    }
}
