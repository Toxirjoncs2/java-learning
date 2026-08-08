import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ex19_l  {
    public static void  main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        for (int i=num;i>=1;i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);


        }
        System.out.println("Done!");



        scanner.close();
    }
}