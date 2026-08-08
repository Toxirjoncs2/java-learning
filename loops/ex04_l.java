import java.util.Scanner;
public class ex04_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt()/10;
        for(int i=1;i<=n;i++){
            System.out.print(10*i + " ");

        }


        scanner.close();
    }
}