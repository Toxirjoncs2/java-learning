import java.util.Scanner;
public class ex06_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int max;
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        if (num>0) {
            System.out.print("Enter the number1: ");
            int num1=scanner.nextInt();
            max=num1;
            for (int i = 2; i <= num; i++) {
                System.out.printf("Enter the number%d: ",i);
                num1=scanner.nextInt();
                if (max<num1){
                    max=num1;
                }

            }
            System.out.println(max);
        }else{
            System.out.println("Number should be greater than 0");
        }




        scanner.close();
    }
}