import java.util.Scanner;
public class ex15_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int sum=0;
        int num=scanner.nextInt();
        if (num>=0) {
            while (num != 0) {
                sum += num % 10;
                num /= 10;

            }
            System.out.println("The sum of digits is "+sum);
        }else
            System.out.println("Invalid input");


        scanner.close();
    }
}