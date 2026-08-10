import java.util.Scanner;

public class ex01_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=scanner.nextInt();
       if(x>=0)
            System.out.print("Positive");
       else
            System.out.print("Negative");
        scanner.close();

    }

}
