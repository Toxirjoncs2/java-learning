import java.util.Scanner;
public class ex01_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        displayPattern(num);

        scanner.close();
    }
    static void displayPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}