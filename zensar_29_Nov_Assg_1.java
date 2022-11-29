/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_Assg_1    : "Write a java program to find the sum of 5 positive numbers.
 */
import java.util.Scanner;
public class zensar_29_Nov_Assg_1 {
    public static void main(String[] args){
        int i,n=0,s=0;
        double avg;
        {

            System.out.println("Input the 5 numbers : ");

        }
        for (i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s +=n;
        }
        System.out.println("The sum of 5 no is : " +s);

    }

}
