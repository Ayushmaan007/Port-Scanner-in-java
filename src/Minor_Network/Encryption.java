package Minor_Network;

import java.io.*;
import java.util.Scanner;

public class Encryption
{
    public static void Encrypt()
    {
        File file1 = new File("D:\\Java\\IntelliJ\\Minor 1\\thread_1.txt");

        File file2 = new File("Encrypted.txt");

        FileWriter fw = null;
        try
        {
            fw = new FileWriter(file2);
        } catch (Exception ignore)
        {
        }

        PrintWriter pw = new PrintWriter(fw);

        Scanner filein = null;
        try {
            filein = new Scanner(file1);
        } catch (Exception ignore) {

        }

        while (filein.hasNextLine())
        {
            String text = filein.nextLine();
//            System.out.println(text);
            char[] chars = text.toCharArray();

            for (char c : chars) // for(int i = 0; i < chars.length; i++)
            {
                c += 10;// c = c + 10
//                System.out.print(c);
                pw.print(c);
            }
//            System.out.println();
            pw.println();
        }
        pw.close();
    }
}
