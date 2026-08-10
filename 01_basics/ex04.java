import java.math.BigDecimal;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the starting velocity: ");
        double v0=scanner.nextDouble();
        System.out.print("Enter the ending velocity: ");
        double v1=scanner.nextDouble();
        System.out.print("Enter the time: ");
        int time=scanner.nextInt();
        double average=(v1-v0)/time;
        String clean= BigDecimal.valueOf(average).stripTrailingZeros().toPlainString();
        System.out.print("Average velocity is "+clean);


    }
}
