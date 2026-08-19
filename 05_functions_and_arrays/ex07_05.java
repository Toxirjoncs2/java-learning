import java.util.Scanner;
public class ex07_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a:");
        double a=scanner.nextDouble();
        System.out.print("Enter b:");
        double b=scanner.nextDouble();
        System.out.print("Enter c:");
        double c=scanner.nextDouble();
        System.out.print("Enter d:");
        double d=scanner.nextDouble();
        System.out.print("Enter e:");
        double e=scanner.nextDouble();
        System.out.print("Enter f:");
        double f=scanner.nextDouble();
        solveEquation(a,b,c,d,e,f);

        scanner.close();
    }
    static void solveEquation(double a,double b, double c,double d,double e,double f){
        boolean isSolvable=true;
        double x=(e*d-b*f)/(a*d-b*c);
        double y=(a*f-e*c)/(a*d-b*c);
        if((a*d-b*c)==0){
            isSolvable=false;
        }
        if(isSolvable){
            System.out.println("x is "+x);
            System.out.println("y is "+y);
        }else
            System.out.println("The equation has no solution");
    }
}