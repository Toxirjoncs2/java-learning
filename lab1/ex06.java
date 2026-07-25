import java.util.Scanner;
public class ex06 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=scanner.nextInt();
        if (a==b)
            System.out.println("Equal");
        else
            System.out.println("Not equal");



        scanner.close();


    }
}
