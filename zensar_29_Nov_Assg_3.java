/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_Assg_3    : "program to find sum of natural numbers from 1 to 1000."
 */
public class zensar_29_Nov_Assg_3 {
    public static void main(String[] args)
    {
        int i, num = 1000, sum = 0;

        for(i = 1; i <= num; ++i)
        {

            sum = sum + i;
        }

        System.out.println("Sum of First 1000 Natural Numbers is = " + sum);
    }
}
