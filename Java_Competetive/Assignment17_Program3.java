// Write a program to find the maximum of two numbers
import java.util.*;
class Logic 
{
    void findmax(int a , int b)
    {
        if(a > b)
        {
            System.out.println("it is Maximum number:"+a);
        }
        else
        {
            System.out.println("it is Maximum number:"+b);

        }
    }
}
class Assignment17_Program3
{
    public static void main (String A[])
    {
        Logic lobj = new Logic();

        lobj.findmax(20,15);

    }
}