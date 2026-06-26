import java.util.*;

class DigitX
{
    public int SumEvenDigit(int iNo)
    {
        int iEvenSum=0;
        int iDigit=0;
        while(iNo !=0)
        {
            iDigit=iNo%10;
            if(iDigit % 2 == 0)
            {
                iCount=iEvenSum+ iDigit;
            }
       
            iNo=iNo/10;
        }
        return iEvenSum;
    }
}

class Program90
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj= new DigitX();
        int iValue=0;
        int iRet=0;
        System.out.println("Enter a number");
        iValue=sobj.nextInt();

        iRet=dobj.SumEvenDigit(iValue);

        System.out.println("Summation of Even Digit are "+iRet);

        
    }
}