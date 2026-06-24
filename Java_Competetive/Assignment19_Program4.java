// write a program to print each digit of a number separetly
class Logic
{
    void PrintDigit(int num)
    {
        int iDigit=0;
        while(num >0)
        {
            iDigit=num % 10;
            System.out.println(iDigit);
            num=num / 10;
        }


    }
}
class Assignment19_Program4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigit(55);
    }
}