import java.util.*;

class DigitX
{
    public void DisplayDigit(int iNo)
    {
        int iCnt=0;
        for( ;iNo !=0;iNo=iNo/10 )
        {
            iCnt=iNo%10;
            System.out.println(iCnt);
            
        }

    }
}

class Program82
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj= new DigitX();
        int iValue=0;

        System.out.println("Enter a number");
        iValue=sobj.nextInt();

        dobj.DisplayDigit(iValue);

        
    }
}