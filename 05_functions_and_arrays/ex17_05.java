import java.util.Scanner;
public class ex17_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0;
        int count=0;
        while (count<15){
            if (isNarcissistic(num)){
                System.out.print(num+" ");
                count++;

            }
            num++;
        }
        scanner.close();
    }
    static int countDigits(int num){
        String uzunlik=String.valueOf(num);
        int power=uzunlik.length();
        return power;
    }
    static boolean isNarcissistic(int num){
        int sum=0;
        int temp=num;
        while(temp!=0){
            sum+=Math.pow((temp%10),countDigits(num));
            temp/=10;
        }
        if (sum==num){
            return true;
        }else {
            return false;
        }

    }
}