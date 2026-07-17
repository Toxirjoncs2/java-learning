import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        double x;
        double y;
        double t;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x: ");
        x=scanner.nextDouble();
        System.out.print("Enter y: ");
        y=scanner.nextDouble();
        t=3*(Math.pow(x,2)+3)/(y/4+3);
        System.out.println("t = "+t);
    }
}
