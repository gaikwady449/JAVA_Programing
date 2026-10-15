// Write a java program to accept Directory  name from user  and create the Directory
import java.io.File;
import java.util.Scanner;

class Assignment46_Program3
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Directory Name:");
        String DirName = sc.nextLine();

        File file = new File(DirName);

        if (file.exists())
        {
            if (file.isDirectory())
            {
                System.out.println("This Directory is already present.");
            }
            else
            {
                System.out.println("A file with this name already exists.");
            }
        }
        else
        {
            if (file.mkdir())
            {
                System.out.println("Directory created successfully.");
            }
            else
            {
                System.out.println("Unable to create Directory.");
            }
        }

        sc.close();
    }
}