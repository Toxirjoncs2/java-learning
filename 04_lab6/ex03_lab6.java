import java.util.Scanner;
public class ex03_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        int a=0;
        int b=1;
        int result=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=1;i<num;i++){
            result=a+b;
            a=b;
            b=result;
            System.out.print(result+" ");
        }





        scanner.close();
    }
}