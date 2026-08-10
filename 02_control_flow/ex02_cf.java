import java.util.Scanner;

public class ex02_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=scanner.nextInt();
        if(x>=0) {
            System.out.print("Positive and ");

            if (x % 2 == 0)
                System.out.print("even");
            else
                System.out.print("odd");
        }
        else{
            System.out.print("Negative and ");
            if(x%2==0)
                System.out.print("even");
            else
                System.out.print("odd");
        }
        scanner.close();

    }
}
