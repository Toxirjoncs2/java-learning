import java.util.Scanner;
public class ex20_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("|| %-5s | %-10s ||%n","Miles","Kilometers");
        double result;
        for(int i=1;i<=10;i++){
            result=i*1.609;
            System.out.printf("||   %-3s |   %-8s ||%n",i,result);

        }



        scanner.close();
    }
}