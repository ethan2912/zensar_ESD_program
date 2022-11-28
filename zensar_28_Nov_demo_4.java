/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_28_Nov_demo_4    : "If ElseIf Statements"
 */
public class zensar_28_Nov_demo_4 {
    public static void main(String[] args){
        System.out.println("Demo code for else if Statements ");
        int marks=81;
        System.out.println("The Grades of Student is :");
        if(marks > 85){
            System.out.print("Distinction");
        }
        else if(marks > 70 && marks <= 85){
            System.out.println("First Class");
        }
        else if(marks > 50 && marks <= 70){
            System.out.println("First Class");
        }
        else if(marks >= 35 && marks <= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }


    }
}
