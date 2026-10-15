// write java program to accept directory name from user and display
// all names of files from that directory and size of each file on screen
import java.io.File;
import java.util.Scanner;

public class Assignment46_Program5
{
    public static void main( String A[])
    {
        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter the Directory name:");

        String DirName = sobj.nextLine();

        File dir = new File(DirName);

        if(dir.exists() && dir.isDirectory())
        {
            File files[] = dir.listFiles();

            System.out.println("Files in the directory :");

            for(File file :files)
            {
                if(file.isFile())
                {
                    System.out.println("File name :"+file.getName());
                    System.out.println("File Size :"+file.length()+"bytes");
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("There is no directory");
        }

    }
    
}
