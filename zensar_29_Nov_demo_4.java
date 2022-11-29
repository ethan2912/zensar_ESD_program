/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_29_Nov_demo_4    : "Nested for loop"
 */
public class zensar_29_Nov_demo_4 {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.println("the inner for loop iteration :"+i);
                System.out.println("the inner for J :"+j);
            }
        }
        System.out.println("End of for loop");
    }

}
