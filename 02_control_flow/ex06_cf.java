import java.util.Scanner;
public class ex06_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter a: ");
        a=scanner.nextInt();
        System.out.print("Enter b: ");
        b=scanner.nextInt();
        System.out.print("Enter c: ");
        c=scanner.nextInt();
        if(a+b+c==180)
            System.out.print("The triangle is valid");
        else
            System.out.print("The triangle is NOT valid");

        scanner.close();

    }
}
