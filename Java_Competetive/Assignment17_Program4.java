/// Write a program to find minimum of three numbers
class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a<b && a<c)
        {
            System.out.println("IT is minmum number"+a);

        }
        else if(b<a && b<c)
        {
            System.out.println("IT is minmum number"+b);

        }
        else
        {
            System.out.println("IT is minmum number"+c);

        }
    }
}


class Assignment17_Program4
{
    public static void main (String  A[])
    {
        Logic lobj=new Logic();
        lobj.findMin(3,7,2);

    }
}