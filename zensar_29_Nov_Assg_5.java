/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_Assg_5    : "Write a program to demonstrate use of nested for loop."
 */
import java.util.Scanner;
public class zensar_29_Nov_Assg_5 {
    public static void main(String[] args)
    {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows youy want to print: ");
        rows = sc.nextInt();
        for (i = rows; i >= 1; i--)
        {
            for (j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
