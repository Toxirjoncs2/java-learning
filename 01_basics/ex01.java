import java.util.Scanner;
public class ex01  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int add=a+b;
        int multiply=a*b;
        System.out.println(a+" + "+b+" = "+add);
        System.out.println(a+" * "+b+" = "+multiply);
        scanner.close();
    }
}