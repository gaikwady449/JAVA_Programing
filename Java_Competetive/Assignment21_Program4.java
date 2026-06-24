// Write a program to print all numbers from 1 to N that are divisible by both 2 and 
class Logic
{
    void CountFactor(int num)
    {
        int iCount=0;
        for(int iCnt= 0; iCnt<=num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCount++;
            }
        }
        System.out.println("Count of factoe is :"+iCount);
    }
}
class Assignment21_Program4
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.CountFactor(12);

    }
}