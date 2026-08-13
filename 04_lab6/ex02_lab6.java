import java.util.Scanner;
public class ex02_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1=scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2=scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3=scanner.nextInt();
        if (num3%num2==0 && num3%num1==0)
            System.out.printf("%d and %d are the factors of %d",num1,num2,num3);
        else if (num3%num1==0 && num3%num2!=0)
            System.out.printf("Only %d is the factor of %d",num1,num3);
        else if (num3%num2==0 && num3%num1!=0)
            System.out.printf("Only %d is the factor of %d",num2,num3);
        else
            System.out.printf("%d and %d aren't the factors of %d",num1,num2,num3);

        scanner.close();
    }
}