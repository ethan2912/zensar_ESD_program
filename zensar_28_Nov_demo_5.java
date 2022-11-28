
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_28_Nov_demo_5    : "Switch Statements"
 */
public class zensar_28_Nov_demo_5 {
    public static void main(String[] args) {

        int num1 = 5;
        System.out.println("Test for number : ");
        switch (num1) {
            case 1:
                System.out.println("The number is one: " + num1);
                break;
            case 2:
                System.out.println("The number is Two: " + num1);
                break;
            case 4:
                System.out.println("The number is Four: " + num1);
                break;
            case 5:
                System.out.println("The number is Five: " + num1);
                break;
            default:
                System.out.println("The number is invalid: " + num1);
        }
        System.out.println("Code ended..");
    }
}
