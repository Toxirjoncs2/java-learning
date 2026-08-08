import java.util.Scanner;
public class ex09_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        int max= Integer.MIN_VALUE;
        do {
            System.out.print("Enter a number (0 to quit): ");
            num = scanner.nextInt();
            if (num==0)
                break;
            else if (num>max)
                max=num;

        }while (num!=0);
        System.out.println(max);


        scanner.close();
    }
}