import java.util.Scanner;
public class ex07 {
    //if a is the largest output->1 else ->0
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int c=scanner.nextInt();
        if (a>=b && a>=c)
            System.out.println(1);
        else
            System.out.println(0);



        scanner.close();


    }
}