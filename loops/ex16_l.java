import java.util.Scanner;
public class ex16_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int sum=0;
        int i=0;
        while(num!=0){
            sum+=num%10*Math.pow(2,i);
            i++;
            num/=10;

        }
        System.out.println(sum);

        scanner.close();
    }
}