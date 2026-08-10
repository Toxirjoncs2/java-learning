import java.util.Scanner;
public class ex10_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a;
        System.out.println("Enter a three-digit integer: ");
        a=scanner.nextInt();

        if (a>=100 && a<=999)
            if (a%10==a/100)
                System.out.println("Palindrome");
            else
                System.out.print("Not palindrome");
        else
            System.out.printf("%d is not a three-digit integer",a);




        scanner.close();

    }
}
