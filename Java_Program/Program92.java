import java.util.*;

class DigitX
{
    public int RevereseNumber(int iNo)
    {
        int iRev=0;
        int iDigit=0;
        while(iNo !=0)
        {
            iDigit=iNo%10;
            iRev=(iRev*10)+iDigit;
            iNo=iNo/10;
        }
        return iRev;
    }
}
class Program92
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj= new DigitX();
        int iValue=0;
        int iRet=0;
        System.out.println("Enter a number");
        iValue=sobj.nextInt();

        iRet=dobj.RevereseNumber(iValue);

        System.out.println("Reverse number are  "+iRet);

        
    }
}