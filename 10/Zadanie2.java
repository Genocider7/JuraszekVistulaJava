import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie2
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String filename;
        int read_byte;
        System.out.println("Please enter filename: ");
        filename = console.nextLine();
        try (FileInputStream fileStream = new FileInputStream(filename))
        {
            do 
            {
                //throws error for some reason, I don't know why
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
            console.close();
            System.out.println("Nie znaleziono pliku \"" + filename + "\"");
            return;
        }
        catch (IOException e)
        {
            System.out.println("Błąd podczas odczytywania z pliku");
        }
        
        console.close();
    }
}