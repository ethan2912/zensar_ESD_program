/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_demo_4_3  : "Continue in Nested fro loop"
 */
public class zensar_29_Nov_demo_4_3 {
    public static void main(String[] args){

        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){


                if(i==3){
                    continue  ;
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("End of for loop");
    }
}
