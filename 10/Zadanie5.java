import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class Zadanie5 {
    public static void main(String[] args) {
        final int newline = 10;
        URL bankInfo;
        String numbers;
        boolean isOk = false;
        String line;
        String[] data;
        int read_byte;
        String bankName = "";
        boolean found = false;
        try (Scanner console = new Scanner(System.in))
        {
            do
            {
                System.out.print("Please enter first three numbers of your bank account: ");
                numbers = console.next();
                if (numbers.length() != 3)
                {
                    System.out.println("Incorrect input");
                    continue;
                }
                isOk = true;
            }
            while (!isOk);
        }
        try 
        {
            bankInfo = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        }
        catch (MalformedURLException e)
        {
            System.out.println("Error opening bank database url");
            return;
        }
        try (InputStream in = bankInfo.openStream())
        {
            do 
            {
                line = "";
                do
                {
                    read_byte = in.read();
                    if (read_byte != -1 && read_byte != newline)
                    {
                        line += (char)read_byte;
                    }
                }
                while (read_byte != newline && read_byte != -1);
                if (read_byte == -1)
                {
                    continue;
                }
                data = line.split("\t");
                if (data.length < 2)
                {
                    continue;
                }
                if (numbers.equals(data[0].trim()))
                {
                    bankName = data[1].trim();
                    found = true;
                }
            }
            while (read_byte != -1 && !found);
        }
        catch (IOException e)
        {
            System.out.println("There has been error handling bank database file");
        }
        if (!found)
        {
            System.out.println("Bank hasn't been found");
            return;
        }
        System.out.println("Bank number: " + numbers + " Your bank is " + bankName);
    }
        
}
