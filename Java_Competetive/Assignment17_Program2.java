// Write a program to check whether a number is palindrome or not 
class Logic
{
    void CheckPalindrome(int inum)
    {
        int iReverse=0;
        int iDigit=0;

        while(inum > 0)
        {
            iDigit=inum% 10;
            iReverse = iReverse * 10 + iDigit;
            inum=inum/10;
        }
        if(inum == iReverse)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println(" number is not Palindrome Number");

        }
    }
}

class Assignment17_Program2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);

    }
}