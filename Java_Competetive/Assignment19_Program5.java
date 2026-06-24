// write a program to Calculate the power of number using loops 
class Logic
{
    void CalculatePower(int Base, int Exp)
    {
        int iResult=1;
        for(int iCnt=1; iCnt<= Exp;iCnt++)
        {
            iResult=iResult * Base;
        }
        System.out.println("Power of number is :"+iResult);
    }
}
class Assignment19_Program5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}