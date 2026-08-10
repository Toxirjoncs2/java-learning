import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double area;
        System.out.print("Enter a diameter: ");
        double diameter=scanner.nextDouble();
        area=Math.PI*Math.pow(diameter,2);
        System.out.print("Area = "+area);
    }
}
