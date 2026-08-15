import java.util.Scanner;
public class ex09_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("You have to enter 5 integers");
        for (int i=0;i<5;i++){
            System.out.print("Integer num"+(i+1)+": ");
            num[i]=scanner.nextInt();
        }
        for (int j=0;j<5;j++){
            for (int k=j+1;k<5;k++){
                System.out.println(num[j]+" "+num[k]);
            }
        }
        scanner.close();
    }
}