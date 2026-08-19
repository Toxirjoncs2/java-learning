import java.util.Scanner;
public class ex02_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        if (getType(num)==0){
            System.out.println("Odd");
        }else
            System.out.println("Even");
        scanner.close();
    }
    static int getType(int n) {
        String num=String.valueOf(n);
        if (num.startsWith("-")){
            num=num.replace("-","");
        }
        if(num.length()%2==0) {
            return 1;
        }else
            return 0;
    }
}