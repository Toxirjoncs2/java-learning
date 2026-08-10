import java.util.Scanner;
public class ex17_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=2;
        System.out.print("Enter an integer: ");

        while (!scanner.hasNext()){
            System.out.print("Error!That is not valid integer");
            System.out.print("Enter an integer: ");
            scanner.next();

        }
        int num=scanner.nextInt();
        while(num!=1){
            if (num%i==0){
                System.out.print(i+" ");
                num/=i;
            }else
                i+=1;
        }
        scanner.close();
    }
}