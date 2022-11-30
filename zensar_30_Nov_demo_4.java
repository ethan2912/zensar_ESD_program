/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_30_Nov_demo_4    : "3 dimentional Array"
 */
public class zensar_30_Nov_demo_4 {
    public static void main(String[] args){
        int[][][] num={
                { {3,4,5},{5,6,7},{8,2,1}},
                { {8,4,15},{44,98},{67,78,34}},
                { {34,4,55},{67,32,54},{56}}
        };
        for(int[][] arr2d:num){
            for(int [] innerarray:arr2d){
                for(int i:innerarray){
                    System.out.println("The element is:"+i);
                }
            }
        }
    }

}
