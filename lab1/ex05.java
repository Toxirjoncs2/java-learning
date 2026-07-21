import java.util.Scanner;
public class ex05 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double distance=scanner.nextDouble();
        System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
        double efficiency=scanner.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double price=scanner.nextDouble();
        double result=distance/efficiency*price;
        String formatted=String.format("%.3f",result);
        System.out.println("The cost of driving is $"+formatted);

    }
}
