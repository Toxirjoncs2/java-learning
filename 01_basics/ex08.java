import java.util.Scanner;
public class ex08 {
    //if a is the largest output->1 else ->0
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the initial amount of money: ");
        double initial=scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        double rate=scanner.nextDouble()/100;
        System.out.print("Enter the number of times compounded per year: ");
        int timesCompound=scanner.nextInt();
        System.out.print("How many years you want: ");
        int years=scanner.nextInt();
        double amount;
        amount=initial*Math.pow(1 + rate/timesCompound, timesCompound*years);
        System.out.printf("With $%.2f amount of money and %f%% interest rate and %d numbers of times compound in %d years you will get $%.2f ",initial,rate,timesCompound,years,amount);



        scanner.close();


    }
}