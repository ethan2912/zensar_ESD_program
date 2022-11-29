/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_Assg_4    : "Write a program to demonstrate use of break and continue keyword in java"
 */
import java.util.Scanner;
public class zensar_29_Nov_Assg_4 {

    public static void main(String[] args)
    {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        rows = sc.nextInt();

        for (i = 1; i <= rows; i++)
        {
            for (j = 1; j <= i; j++)
            {   if(i==3){
                break ;
            }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
