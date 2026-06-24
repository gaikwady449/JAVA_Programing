// Write a program to find the sum of all even numbers uo to N
class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt=0;
        for(iCnt=0;iCnt<=n;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Assignment20_Program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);    

    }
}