import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class Zadanie1
{
    static final String fp="staff.txt";
    public static void main(String[] args) {
        FileInputStream filestream;
        int read_byte;
        ArrayList<String> stafflist = new ArrayList<String>();
        String line = "";
        try 
        {
            filestream = new FileInputStream(fp);
        } catch (FileNotFoundException e)
        {
            System.out.println("file " + fp + " not found!");
            return;
        }
        try 
        {
            do
            {
                read_byte = filestream.read();
                if (read_byte == -1)
                {
                    break;
                }
                if (read_byte == '\n')
                {
                    stafflist.add(line);
                    line = "";
                } else
                {
                    line += (char)read_byte;
                }
            } while(read_byte != -1);
            stafflist.add(line);
        } catch (IOException e)
        {
            System.out.println("Error while parsing file");
        }

        try
        {
            filestream.close();
        }
        catch (IOException e)
        {
            System.out.println("Error while closing a file");
        }
        
        for (String person : stafflist)
        {
            System.out.println(person);
        }

    }
}