/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_demo_4_2  : "Break in Nested fro loop"
 */
public class zensar_29_Nov_demo_4_2 {
    public static void main(String[] args){
        first:
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){


                if(i==3){
                    break first;
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("End of for loop");
    }
}
