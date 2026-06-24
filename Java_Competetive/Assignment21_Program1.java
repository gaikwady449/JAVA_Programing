// Write a program to calculate the profuct of digiti of number 
class Logic
{
    void ProductOfDigit(int num)
    {
        int iDigit=0,iProduct=1;
        while(num > 0)
        {
            iDigit=num%10;
            iProduct *= iDigit;
            num=num/10;
        }
        System.out.println("Product of Number is :"+iProduct);
    }
}
class Assignment21_Program1
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.ProductOfDigit(1234);

    }
}