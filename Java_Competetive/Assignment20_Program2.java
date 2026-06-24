// Write a program to print numbers from N down 1 in severse order
class Logic
{
    void PrintReverse(int n)
    {
        int iCnt=0;
        for(iCnt=10;iCnt>=0;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
class Assignment20_Program2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);    

    }
}