import java.util.Scanner;
public class ex18_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double pi=0;
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            pi+=Math.pow(-1,i+1)/(2*i-1);
        }
        System.out.println(pi*4);

        scanner.close();
    }
}