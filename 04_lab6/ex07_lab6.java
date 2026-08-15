import java.util.Scanner;
public class ex07_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int min;
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        if (num>0) {
            System.out.print("Enter the number1: ");
            int num1=scanner.nextInt();
            min=num1;
            for (int i = 2; i <= num; i++) {
                System.out.printf("Enter the number%d: ",i);
                num1=scanner.nextInt();
                if (min>num1){
                    min=num1;
                }

            }
            System.out.println(min);
        }else{
            System.out.println("Number should be greater than 0");
        }



        scanner.close();
    }
}