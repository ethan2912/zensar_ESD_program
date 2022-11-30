/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_30_Nov_demo_3    : "traversing 2 dimentional Array"
 */
class zensar_30_Nov_demo_3 {
    public static void main(String args[]) {
        System.out.println("Demo for 2 Dimensional array");
        int[][] arr = {{1, 2, 3}, {2, 3, 4, 5}, {4, 3, 2}, {4}};
        System.out.println("Array created...");
        System.out.println("Accessing 2D Array elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The element is: " + arr[i][j]);
            }
            System.out.println("- - - - - - - - -");
        }
        System.out.println("The code ended...");
    }
}
