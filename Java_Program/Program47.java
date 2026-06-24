// type3 amd Big code created separet calss

import java.util.Scanner;
class NumberX
{
    public  void DisplayFactors(int iNo)
    {
        //logic 
        int iCnt=0;

        for(iCnt=1;iCnt<(iNo/2);iCnt++)
        {
            if((iNo % iCnt ) == 0)
            {
                System.out.println(iCnt);

            }
        }
              
    }
    
}
class Program47
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        int iValue=0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

        NumberX nobj=new NumberX();

        nobj.DisplayFactors(iValue);
    }

}


// Time Complexoty : o(N/2)
//Where N >= 0