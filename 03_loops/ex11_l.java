import java.util.Scanner;
public class ex11_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++)
                System.out.print("*  ");
            System.out.println();
        }


        scanner.close();
    }
}