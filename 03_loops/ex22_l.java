import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class ex22_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int even=0;
        int odd=0;
        for (int i=1;i<=10;i++){
            int num=random.nextInt(1,1000);
            System.out.print(num+" ");
            if (num%2==0){
                even+=1;
            }else{
                odd+=1;
            }

        }
        System.out.println();
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);


        scanner.close();
    }
}