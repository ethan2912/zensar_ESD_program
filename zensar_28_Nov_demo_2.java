
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_28_Nov_demo_2    : "Taking Input"
 */
import java.util.Scanner;

public class zensar_28_Nov_demo_2 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Demo 2 for scanner class ");
        System.out.println("Enter the float value: ");
        float num1 = obj.nextFloat();
        System.out.println("The value is: "+num1);
        System.out.println("Enter the string value: ");
        String name = obj.next();
        System.out.println("The string value is: "+name);
    }

}
