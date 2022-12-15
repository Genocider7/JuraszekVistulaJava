import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        String filename;
        String filename2;
        int read_byte;
        try (Scanner console = new Scanner(System.in))
        {
            System.out.println("Please enter filename:");
            filename = console.nextLine();
            System.out.println("Please enter name of the second file:");
            filename2 = console.nextLine();
        }
        try (FileInputStream in = new FileInputStream(filename); FileOutputStream out = new FileOutputStream(filename2))
        {
            do
            {
                read_byte = in.read();
                if (read_byte  != -1 && read_byte != (int)' ')
                {
                    out.write((char)read_byte);
                }
                if (read_byte == (int)' ')
                {
                    out.write('-');
                }
            }
            while (read_byte != -1);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File has not been found");
        }
        catch (IOException e)
        {
            System.out.println("There has been error handling the file");
        }
    }  
}
