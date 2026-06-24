/// Write a program to print miltiplication table of a number 
class Logic
{
    void Table(int num)
    {
        int iCnt=0;
        int iMul=1;
        for(iCnt=1;iCnt<=10;iCnt++)
        {
            iMul=iCnt*num;
            System.out.println(iMul);
        }
    }
}
class Assignment17_Program5
{
    public static void main (String  A[])
    {
        Logic lobj=new Logic();
        lobj.Table(5);

    }
}