// write a program to Display the grade of student based on marks
class Logic
{
    void displayGrade(int Marks)
    {
        if(Marks >=90 &&  Marks<=100)
        {
            System.out.println("A");
        }
        else if(Marks >=70 && Marks<90)
        {
            System.out.println("B");
        }
        else if(Marks >=35 && Marks <70)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fali");

        }
    }
}
class Assignment19_Program2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayGrade(40);
    }
}