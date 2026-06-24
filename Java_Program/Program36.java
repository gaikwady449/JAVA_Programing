import java.util.*;

class Program36
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        String sName=null;
        int iAge =0;
        float fMarks=0.0f;

        System.out.println("enter your name:");
        sName=sobj.nextLine();

        System.out.println("enter your Age:");
        iAge=sobj.nextInt();

        System.out.println("enter your Marks");
        fMarks=sobj.nextFloat();

        System.out.println("Name"+sName);
        System.out.println("Age"+iAge);
        System.out.println("Marks"+fMarks);

    
    }
}