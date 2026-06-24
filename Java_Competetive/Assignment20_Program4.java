// Write a program to find largest digit in a number
class Logic
{
    void FindLargrstDigit(int num)
    {
        int iDigit=0;
        int Largest=0;
        while(num > 0)
        {
            iDigit=num  % 10;
            if(iDigit>Largest)
            {
                Largest=iDigit;
            }
            num=num/10;
        }
        System.out.println("Largest digit in number is :"+Largest);

    }
}
class Assignment20_Program4   
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargrstDigit(8342); 
    }
}