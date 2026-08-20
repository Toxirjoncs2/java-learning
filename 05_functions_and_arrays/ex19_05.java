import java.util.Scanner;
public class ex19_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int difference;
        System.out.print("Enter the initial hour and minute");
        int hour1=scanner.nextInt();
        int minute1=scanner.nextInt();
        System.out.print("Enter the last hour and minute");
        int hour2=scanner.nextInt();
        int minute2=scanner.nextInt();
        if((hour1>24 || hour1<0) || (minute1>=60 || minute1<0) || (hour2>24 || hour2<0) || (minute2>=60 || minute2<0)){
            System.out.println("Invalid form");
        }else {
            difference=(hour2*60+minute2)-(hour1*60+minute1);
            System.out.println(difference+" minutes");
        }
        scanner.close();
    }
}