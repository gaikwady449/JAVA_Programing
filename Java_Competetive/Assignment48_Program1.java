import java.util.*;

public class Assignment48_Program1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of days you kept book :");

        int fineAmount=0;
        int dayskept= sobj.nextInt();

        if(dayskept < 0 )
        {
            System.out.println("Invalid input");
        }
        else if(dayskept <= 7)
        {
            System.out.println("Returned on time No fine applicable");
        }
        else if(dayskept <= 12)
        {
            fineAmount = (dayskept - 7)* 5;
            System.out.println("Total fine to be paid is:"+fineAmount);
        }
        else 
        {
            fineAmount =25 + (dayskept - 12) * 10;
            System.out.println("Total fine to be Paid :"+fineAmount);
        }
    }
}