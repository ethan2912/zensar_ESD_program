/*
    Zensar's trainig ESD Program
    Name : shreyash Sukumar Patil
    Dept : Computer Engineering
    Clg  : RIT
    CodeName :zensar_30_Nov_demo_2    : "Sum of all elements"
 */
public class zensar_30_Nov_demo_2 {
    public static void main(String[] args){
        int[] numbers={34,67,54,87,-3,78,-65,-54,70,65,23,-98};
        int sum=0;
        double avg;
        for (int a:numbers){
            System.out.println("The element is :"+a);

        }
        for (int s:numbers){
            sum=sum+s;

        }
        System.out.println("The sum is  :"+sum);
        int lenght=numbers.length;
        avg=((double)sum/(double)lenght);
        System.out.println("The Average  is  :"+avg);


    }

}
