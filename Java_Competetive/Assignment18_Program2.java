// write a program to print All even number up to N
class Logic
{
    void PrintEvenNumber(int num)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(iCnt % 2 == 0)
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
        lobj.PrintEvenNumber(20);

    }
}