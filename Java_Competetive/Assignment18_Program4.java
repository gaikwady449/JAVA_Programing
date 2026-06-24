// write a program to find the sum of even and odd digits seperately in a number
class Logic
{
    void PrintOddEvenNumber(int num)
    {
        int EvenSum=0,OddSum=0,iDigit;
        while (num > 0)
        {
            iDigit=num % 10;
            if(iDigit % 2 ==0)
            {
                EvenSum += iDigit;
            }
            else
            {
                OddSum += iDigit;
            }
            num = num / 10;
        }

        System.out.println("Sum of even number is"+EvenSum);
        
        System.out.println("Sum of odd number is"+OddSum);
    }
}
class Assignment18_Program4
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.PrintOddEvenNumber(123456);

    }
}