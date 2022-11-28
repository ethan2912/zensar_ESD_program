
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_28_Nov_demo_1    : "Taking Input"
 */
import java.util.Scanner;

public class zensar_28_Nov_demo_1 {
    // main method
    public static void main(String args[])
    {
        // classname object_name = new classname()
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer value.");
        int num1 = input.nextInt();
        System.out.println("The value given is: "+num1);
        System.out.println("Enter the second integer value.");
        int num2 = input.nextInt();
        System.out.println("The value given is: "+num2);
        System.out.println("Addition is: "+(num1+num2));
        input.close();  // closing the scanner object
    }

}