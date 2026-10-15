// Write java program to accepet directory name from user and display all
// names of files from that directory which is reguler file
import java.io.File;
import java.util.*;
public class Assignment47_Program1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Directory name :");
        String DirName  = sc.nextLine();

        File Dir = new File(DirName);

        if(Dir.exists() && Dir.isDirectory())
        {
            File files[] = Dir.listFiles();

            if(files != null)
            {
                System.out.println("Reguler Files in directory are:");
                for(int i = 0 ; i < files.length;i++)
                {
                    if(files[i].isFile())
                    {
                        System.out.println(files[i].getName());
                    }

                }
            }
            else
            {
                System.out.println("unable to read directory");
            }
        }
        else
        {
            System.out.println("Directory Dose not exist");
        }

        sc.close(); 
    }
}