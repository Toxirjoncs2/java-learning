import java.util.Scanner;
public class ex05_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char ch;
        int count=0;

        for ( ch=65;ch<=90;ch++){
            System.out.print(ch);
            count++;
            if(count%5==0)
                System.out.print("\n");

        }


        scanner.close();
    }
}