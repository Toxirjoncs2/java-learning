import java.util.Scanner;
public class ex06_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=scanner.nextDouble();
        System.out.print("Enter b: ");
        double b=scanner.nextDouble();
        System.out.print("Enter c: ");
        double c=scanner.nextDouble();
        solveQuadraticEquation(a,b,c);
        scanner.close();
    }
    static void solveQuadraticEquation(double a,double b,double c){
        double discriminant=Math.pow(b,2)-4*a*c;
        double root1;
        double root2;
        if (discriminant>0){
            root1=(-b+Math.sqrt(discriminant))/(2*a);
            root2=(-b-Math.sqrt(discriminant))/(2*a);
            System.out.printf("1st root = %.2f\n",root1);
            System.out.printf("2nd root = %.2f\n",root2);
        }else if (discriminant==0){
            root1=-b/(2*a);
            System.out.println("root = "+root1);
        }else
            System.out.println("Equation has no roots");
    }
}