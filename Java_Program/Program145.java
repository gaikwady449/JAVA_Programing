import java.util.*;

class Program144
{
    public static void Upadate(int Arr[])
    {
        int iCnt=0;
        for(iCnt=0;iCnt< Arr.length;iCnt++)
        {
            Arr[iCnt]++;
        }

    }
    public static void main(String A[])
    {
        int Brr[]={10,20,30,40,50};
        int iCnt=0;

        System.out.println("Array element Before call");
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        
        }
        Upadate(Brr);

        System.out.println("Array element After call");
        for(iCnt=0;iCnt< Brr.length;iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

    }

}