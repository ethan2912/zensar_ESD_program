

/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_30_Nov_demo_3_1  : "traversing 2 dimentional Array using for-each method "
 */
public class zensar_30_Nov_demo_3_1 {


        public static void main(String args[])
        {

            int[][] arr = { {9,2,8},{1,5,7,5},{7,3,9},{2}};


            for(int[] innerArray:arr)
            {
                for(int i:innerArray)
                {
                    System.out.println("The element is: "+i);
                }
                System.out.println("=========================");
            }
            System.out.println("The code ended...");
        }
  }




