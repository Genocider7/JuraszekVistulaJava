import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie2
{
    public static void main(String[] args) {
        String filename;
        int read_byte;
        try (Scanner console = new Scanner(System.in))
        {
            System.out.println("Please enter filename: ");
            filename = console.nextLine();
        }
        try (FileInputStream fileStream = new FileInputStream(filename))
        {
            do 
            {
                read_byte = fileStream.read();
                if (read_byte != -1)
                {
                    System.out.println((char)read_byte);
                } 
            }
            while (read_byte != -1);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku \"" + filename + "\"");
            return;
        }
        catch (IOException e)
        {
            System.out.println("Błąd podczas odczytywania z pliku");
        }
    }
}