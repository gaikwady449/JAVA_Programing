// Write a java program to accept file name from user and open that file and
// Display Content on the Screen
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Assignment45_Program3
{
    public static void main(String A[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter File name");
        String fileName = sc.nextLine();

        System.out.print("Enterd data to append:");
        String data = sc.nextLine();
        try
        {
            FileWriter fw  = new FileWriter(fileName,true);

            fw.write(data);
            fw.write(System.lineSeparator());

            fw.close();

            System.out.println("Data appended successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error : " +e.getMessage());
        }
        sc.close();

    }

}