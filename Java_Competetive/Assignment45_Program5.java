// Write a java program to accept file name from user and display all names 
// of file in that directory
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Assignment45_Program5
{
    public static void main(String A[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter directory path:");
        String path = sc.nextLine();

        File dir = new File(path);

        if(dir.exists() && dir.isDirectory())
        {
            String[] files = dir.list();

            System.out.println("Files in the Directory Are:");

            for(String file : files)
            {
                System.out.println(file);
            }
        }
        else
        {
            System.out.println("Invalid directory");   
        }
        
        sc.close();
    }

}