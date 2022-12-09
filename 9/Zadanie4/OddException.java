package Zadanie4;

public class OddException extends Exception {
    public OddException()
    {
        super("Your number is odd");
    }
    public OddException(String errString)
    {
        super(errString);
    }
}
