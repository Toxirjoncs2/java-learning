import java.util.Scanner;
public class ex10_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println(avgOfEvenPlaces(num));
        scanner.close();
    }
    static double avgOfEvenPlaces(int num) {
        double sum=0;
        int temp=num;
        double result;
        String newNum = String.valueOf(num);
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp=num;
        int count=0;
        if (digits>1 && digits%2==0){
            while (temp!=0){
                sum+=(temp%10);
                temp/=100;
                count++;
            }
        }else if(digits>1 && digits%2!=0){
            temp/=10;
            while(temp!=0){
                sum+=(temp%10);
                temp/=100;
                count++;
            }
        }
        else {
            result=0.0;
            count=1;
        }
        result=sum/count;

    return result;
    }

}