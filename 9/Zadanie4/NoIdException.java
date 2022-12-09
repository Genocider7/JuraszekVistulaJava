package Zadanie4;

public class NoIdException extends Exception {
    public NoIdException()
    {
        super("There was no matching id");
    }
    public NoIdException(String errString)
    {
        super(errString);
    }
}
