import java.util.Scanner;
public class ex01_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp=scanner.nextDouble();
        System.out.print("Enter the wind-speed (>=2): ");
        double speed=scanner.nextDouble();
        double windChill;
        if (temp<-58 || temp>41){
            System.out.println("Invalid input");
        }else{
            if (speed<2){
                System.out.println("Invalid input");
            }else{
                windChill=35.74+0.6215*temp-35.75*Math.pow(speed,0.16)+0.4275*temp*Math.pow(speed,0.16);
                System.out.printf("The wind chill index is %.5f",windChill);
            }
        }



        scanner.close();
    }
}