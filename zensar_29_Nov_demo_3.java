/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_demo_3    : "Break"
 */
public class zensar_29_Nov_demo_3 {
    public static void main(String args[])
    {
        System.out.println("Demo for Break statement");

        for(int i=1;i<=5;i++)
        {
            System.out.println("This is for loop : "+i);
            if( i == 3)
            {
                System.out.println("Break statement..");
                break;
            }
            System.out.println("Code after if statement");
        }
        System.out.println("Code after for loop..");

    }

}
