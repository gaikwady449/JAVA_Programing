// Write a program to find largest digit in a number
class Logic
{
    void FindSmallDigit(int num)
    {
        int iDigit=0;
        int Smallest=9;
        while(num > 0)
        {
            iDigit=num  % 10;
            if(iDigit<Smallest)
            {
                Smallest=iDigit;
            }
            num=num/10;
        }
        System.out.println("Smallest digit in number is :"+Smallest);
    }
}
class Assignment20_Program5 
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallDigit(8342); 
    }
}