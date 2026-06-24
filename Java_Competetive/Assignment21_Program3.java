// Write a program to display all factors of a given number 
class Logic
{
    void DisplayFactor(int num)
    {
        for(int iCnt= 0; iCnt<=num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Assignment21_Program3
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.DisplayFactor(12);

    }
}