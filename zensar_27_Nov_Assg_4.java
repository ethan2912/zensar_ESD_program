/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_27_Nov_demo_4    : "Write a Java class to demonstrate use of relational operators"
 */
import java.util.Scanner;
public class zensar_27_Nov_Assg_4 {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first integer:");
        int a = s.nextInt();
        System.out.print("Enter second integer:");
        int b = s.nextInt();
        System.out.println("a == b : " + (a == b) );
        System.out.println("a != b : " + (a != b) );
        System.out.println("a > b : " + (a > b) );
        System.out.println("a < b : " + (a < b) );
        System.out.println("b >= a : " + (b >= a) );
        System.out.println("b <= a : " + (b <= a) );
    }
}
