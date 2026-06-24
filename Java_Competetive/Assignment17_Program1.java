// Write a program to find the sum of digits of a number
class Logic
{
    void SumOfDigits(int inum)
    {
        int iSum=0;
        int iDigit=0;

        while(inum > 0)
        {
            iDigit=inum% 10;
            iSum=iSum+iDigit;
            inum=inum/10;
        }
        System.out.println("Sum of Digit is :"+iSum);
    }
}

class Assignment17_Program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);

    }
}