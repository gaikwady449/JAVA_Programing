import java.util.*;
public class Assignment48_Program2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the current Balance ");
        int Balance = sobj.nextInt();

        System.out.println("Enter the Withdraw Amount ");
        int Amount = sobj.nextInt();

        int Remaining = 0;

        if(Balance < 0 || Balance <= 0  )
        {
            System.out.println("Invalid input");
        }
        else if(Amount % 100 != 0)
        {
            System.out.println("Transaction failed : Withdraw amount must be multiple of 100  ");
        }
        else if(Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum Withdrwal limit exceded");
        }
        else
        {
            Remaining = Balance - Amount;
            if(Remaining < 1000)
            {
                System.out.println("Transaction failed : Minumum balance required not maintain");
            }
            else
            {
                System.out.println("Transaction Successful\n"+"Remaining balance are:"+Remaining);
            }
        }
        sobj.close();
    }
    
}
