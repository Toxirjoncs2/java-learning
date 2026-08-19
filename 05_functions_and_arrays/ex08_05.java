import java.util.Scanner;
public class ex08_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.println(octal2Decimal(num));
        scanner.close();
    }
    static int octal2Decimal(int num){
        int total=0;
        int i=0;
        while (num>0){
            total+=((num%10)*Math.pow(8,i));
            num/=10;
            i+=1;
        }
        return total;
    }
}