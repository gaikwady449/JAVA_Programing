// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3
class Logic
{
    void printdivisibleby2and3(int num)
    {
        for(int iCnt= 0; iCnt<=num; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println("Number is divisbe by 2 and 3 is  :"+iCnt);
            }
        }
       
    }
}
class Assignment21_Program5
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.printdivisibleby2and3(30);

    }
}