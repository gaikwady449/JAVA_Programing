// Write a java program to accept two file name from user and open first file
// and create new file (Second name ) and copy the data from first file into newly created file
// Display Content on the Screen
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import  java.io.IOException;
import java.util.Scanner;

class Assignment45_Program1
{
    public static void main(String A[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter File first name");

        String fileName1  = sc.nextLine();

        System.out.println("Enter File second name");

        String fileName2 = sc.nextLine();

        try
        {
            FileReader fr = new FileReader(fileName1);
            FileWriter fw = new FileWriter(fileName2);

            int ch;

            System.out.println("\nContents of the source file :");


            while((ch= fr.read())!=-1)
            {
                System.out.print((char) ch);
                fw.write(ch);
            }
            fr.close();
            fw.close();

            System.out.println("\n\nFile Copied Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error :"+e.getMessage());
        }
        sc.close();

    }

}