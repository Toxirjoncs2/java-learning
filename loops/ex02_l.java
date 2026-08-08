import java.util.Scanner;
public class ex02_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for (int i=1;i<=10;i++){
            System.out.print(i + " ");
            sum+=i;

        }
        System.out.print(sum);


        scanner.close();
    }
}