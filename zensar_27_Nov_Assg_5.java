
/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_27_Nov_demo_5    : "Write a Java class to demonstrate use of logical operators"
 */
public class zensar_27_Nov_Assg_5 {

        public static void main(String[] args) {

            // && operator
            System.out.println((5 > 3) && (8 > 5));  // true
            System.out.println((5 > 3) && (8 < 5));  // false

            // || operator
            System.out.println((5 < 3) || (8 > 5));  // true
            System.out.println((5 > 3) || (8 < 5));  // true
            System.out.println((5 < 3) || (8 < 5));  // false

            // ! operator
            System.out.println(!(5 == 3));  // true
            System.out.println(!(5 > 3));  // false
        }

}
