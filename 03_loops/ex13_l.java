import java.util.Scanner;
public class ex13_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scanner.nextInt();
        if(num>0)
            for (int i=1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        else if (num==0) {
            System.out.println("The depth is 0");

        }else
            System.out.println("It can't be lower than 0");


        scanner.close();
    }
}