import java.util.Scanner;
public class ex14_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        double result=1;
        if(num>0){
            System.out.print("1/1");
            for (int i=2;i<=num;i++){
                System.out.print(" + 1/"+i);
                result+=1/(double)i;

            }


            System.out.println();
            System.out.println("The sum is "+result);
        }else {
            System.out.println("Invalid input");
        }


        scanner.close();
    }
}