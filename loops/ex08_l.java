import java.util.Scanner;
public class ex08_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i+"*"+i+"="+i*i);
        }


        scanner.close();
    }
}