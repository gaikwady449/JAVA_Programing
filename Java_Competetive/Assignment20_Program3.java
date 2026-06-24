// Write a program to Check whether number is prefect Number or Not
class Logic
{
    void CheckPrefect(int n)
    {
        int iCnt=0;
        int iResult=1;
        for(iCnt=1;iCnt< n;iCnt++)
        {
            if(n % iCnt == 0)       
            {
                iResult++;
            }
        }
        if(iResult == 2 )
        {
            System.out.println("It is the perfect numbers");
        }
        else
        {
            System.out.println("It is not  perfect numbers");
        }
    }
}
class Assignment20_Program3     
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrefect(12); 
    }
}