/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_demo_3_1  : "Continue"
 */
public class Zensar_29_Nov_demo_3_1 {
    public static void main(String args[])
    {
        System.out.println("Demo for continue statement");

        for(int i=1;i<=5;i++)
        {
            if( i == 3)
            {
                System.out.println("continue statement..");
                continue;
            }
            System.out.println("This is for loop : "+i);
            System.out.println("Code after if statement");
        }
        System.out.println("Code after for loop..");

    }

}
