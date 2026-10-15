// Write a java program to accept file name from user and create new file of 
// that name if it is not existing 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Assignment45_Program4
{
    public static void main(String A[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter File name");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        try
        {
            if(file.createNewFile())
            {
                System.out.println("File created Successfully");
            }
            else
            {
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error : " +e.getMessage());
        }
        sc.close();
    }

}