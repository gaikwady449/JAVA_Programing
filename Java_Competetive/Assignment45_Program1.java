// Write a java program to accept file name from user and open that file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Assignment45_Program1
{
    public static void main(String A[])
    {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter File name");

        String fileName = input.nextLine();

        try
        {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            System.out.println("\nFile opened Successfully.");
            System.out.println("Contents of the file :");


            while(fileReader.hasNextLine())
            {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error : File Not Found");
        }
        input.close();

    }

}