import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie1
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String filename;
        FileInputStream fileStream;
        int read_byte;
        System.out.println("Please enter filename: ");
        filename = console.nextLine();
        try
        {
            fileStream = new FileInputStream(filename);
        }
        catch (FileNotFoundException e)
        {
            console.close();
            System.out.println("Nie znaleziono pliku \"" + filename + "\"");
            return;
        }
        try
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
        catch (IOException e)
        {
            System.out.println("Błąd podczas odczytywania z pliku");
        }
        finally
        {
            try
            {
                fileStream.close();
            }
            catch (IOException e)
            {
                System.out.println("Błąd podczas zamykania pliku");
            }
        }
        console.close();
    }
}