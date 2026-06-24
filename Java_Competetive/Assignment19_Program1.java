// write a program to check whether a given year is leap year or not
class Logic
{
    void CheckLeapYear(int Year)
    {
        if( Year % 400 == 0 || Year % 4 == 0 && Year % 100 != 0)
        {
            System.out.println("It is leap year");
        }
        else
        {
            System.out.println("It is not  leap year");

        }
    }
}
class Assignment19_Program1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2028);
    }
}