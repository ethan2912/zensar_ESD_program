
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_Assg_2    : "write a program to display n numbers using for loop.
 */
import java.util.Scanner;

public class zensar_29_Nov_Assg_2 {
    public static void main(String[] args) {
        int i, n = 0, s = 0, number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total count of number to print : ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Enter the numbfers ");
            number = in.nextInt();
            System.out.println("your entered number :");
            System.out.println(number);

        }



    }
}
