import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String InpFile = sc.next();
        String OutFile = sc.next();
        HashMap <Character, Integer> dictionary = new HashMap <> ();
        try
        {
            FileInputStream InFile = new FileInputStream (InpFile);
            int cursor = 0;
            while (cursor != -1)
            {
                cursor = InFile.read();
                if (cursor >= 'A' && cursor <= 'Z' || cursor >= 'a' && cursor <= 'z')
                {
                    char letter = (char) cursor;
                    if (!dictionary.containsKey(letter))
                    {
                        dictionary.put(letter, 1);
                    }
                    else
                    {
                        dictionary.put(letter, dictionary.get(letter) + 1);
                    }
                }
            }
            InFile.close();

            FileWriter OuFile = new FileWriter(OutFile);
            for (Map.Entry <Character, Integer> hash : dictionary.entrySet())
            {
                OuFile.write (hash.getKey() + ": " + hash.getValue() + '\n');
                //System.out.println(hash.getKey() + " " + hash.getValue());
            }
            OuFile.close();
        }
        catch (IOException e)
        {
            throw new IOException(InpFile + " does not exist");
        }
    }
}