// write a java program which accept file name from user and calculate 
// checksuu of that file and display on screen 
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.zip.CRC32;

class Assignment46_Program4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the File Name:");
        String FileName = sc.nextLine();

        FileInputStream fis = new FileInputStream(FileName);

        CRC32 crc = new CRC32();

        int data;

        while ((data = fis.read()) != -1)
        {
            crc.update(data);
        }

        System.out.println("Checksum of the file is: " + crc.getValue());

        fis.close();
        sc.close();
    }
}

