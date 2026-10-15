// Write java program to accept directory name from user and write names of all files from that directory
// into one newly created file named as "Marvellous.txt"
import java.util.*;
import java.io.*;

public class Assignment47_Program2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory name :");
        String DirName = sc.nextLine();

        File dir = new File(DirName);

        if(!dir.exists())
        {
            System.out.println("Directory Not exists");
            return;
        }

        if(!dir.isDirectory())
        {
            System.out.println("It is not a Directory");
            return;
        }

        FileOutputStream fw = new FileOutputStream("Marvellous.txt");

        File A[] = dir.listFiles();

        for(int i = 0; i < A.length; i++)
        {
            if(A[i].isFile())
            {
                fw.write((A[i].getName() + "\n").getBytes());
            }
        }
        fw.close();

        System.out.println("File names successfully written into Marvellous.txt");

        sc.close();
    }
}