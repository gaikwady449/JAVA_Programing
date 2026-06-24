// write a program to print All odd number up to N
class Logic
{
    void PrintOddNumber(int num)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                 System.out.println(iCnt);
            }
        }
    }
}
class Assignment18_Program2
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.PrintOddNumber(20);

    }
}