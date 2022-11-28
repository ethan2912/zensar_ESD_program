
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_28_Nov_demo_4_2  : "If Else lader Statements"
 */
public class zensar_28_Nov_demo_4_2 {
    public static void main(String[] args){
        {
            System.out.println("Demo for Nested if..else statement");

            int marks = 50;
            System.out.println("The grades of student are: ");
            if(marks == 50)
            {
                System.out.println("Marks Inside if block: "+marks);
                if (marks < 60)
                {
                    System.out.println("Inside 2nd if block");
                    System.out.println("Marks are less than 60:");
                }
                if (marks < 40)
                { System.out.println("Inside 3rd if block");
                    System.out.println("The marks are greater than 40");
                }
                else
                {
                    System.out.println("This is else block");
                }

            }
            else
            {
                System.out.println("This is outer else block");
            }

            System.out.println("Code ended..");
        }

        }
    }

