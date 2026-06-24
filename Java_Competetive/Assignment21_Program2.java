// Write a program to count how many eeven and odd Numbers are present between 1 to N
class Logic
{
    void CountEvenOddDigit(int num)
    {
        int Odd=0,Even=0;
        for(int iCnt= 0; iCnt<=num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                Even++;
            }
            else
            {
                Odd++;
            }
        }
        System.out.println("Number of Even:"+Even);
        System.out.println("Number of Odd:"+Odd);
    }
}
class Assignment21_Program2
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.CountEvenOddDigit(50);

    }
}