import java.util.Scanner;
public class ex12_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++)
                System.out.print("*  ");
            System.out.println();
        }



        scanner.close();
    }
}