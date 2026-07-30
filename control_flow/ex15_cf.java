import java.util.Scanner;
public class ex15_cf     {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a weight: ");
        int weight=scanner.nextInt();
        switch (weight){
            case 1 -> System.out.println(3500);
            case 2,3 ->System.out.println(5500);
            case 4,5,6,7,8,9,10 -> System.out.println(8500);
            case 11,12,13,14,15,16,17,18,19,20 -> System.out.println(10500);
            default -> System.out.println("The package cannot be shipped");
        }


    }
}
