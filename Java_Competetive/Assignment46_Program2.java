// Write a java program to accept file name from user and check wheter 
// that fille is regular file or not
import java.io.File;
import java.util.Scanner;

class Assignment46_Program2
{
    public static void main(String A[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("ENter the file Name:");

        String filename = sc.nextLine();

        File file =  new File(filename);

        if(file.isFile())
        {
            System.out.println("it is a Regular file.");
        }
        else
        {
            System.out.println("It is not a Regular File.");
        }
    }
}