import java.util.Scanner;
public class ex07_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        boolean isPrime=true;
        System.out.print("Enter a number: ");
        num=scanner.nextInt();
        if (num<=1){
            System.out.println("Not prime");
        }else{
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }


            }
            if (isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }


        }


        scanner.close();
    }
}