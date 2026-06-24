// write a program to chek whether a number is divisible by 5 and 11 or not 
class Logic
{
    void CheckDivisible(int num)
    {
        if(num % 5 ==0 && num % 11 ==0)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }

 
    }
}
class Assignment19_Program3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}