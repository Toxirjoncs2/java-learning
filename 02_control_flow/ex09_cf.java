import java.util.Scanner;
public class ex09_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter weight and price for package1: ");
        double weight1=scanner.nextDouble();
        double price1=scanner.nextDouble();
        System.out.print("Enter weight and price for package2: ");
        double weight2=scanner.nextDouble();
        double price2=scanner.nextDouble();
        if(price1/weight1 > price2/weight2)
            System.out.println("package 2 is better");
        else if(price1/weight1 < price2/weight2)
            System.out.println("package 1 is better");
        else
            System.out.println("both are the same");



        scanner.close();

    }
}
