// write a program to Check whether a numbers a prime or not
class Logic
{
    void CheckPrime(int num)
    {
        int iCnt=0;
        int iCount=0;
        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
        if(iCount == 2)
        {
            System.out.println("number is Prime");
        }
        else
        {
            System.out.println("number not is Prime");
        }
    }

}

class Assignment18_Program1
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.CheckPrime(11);

    }
}