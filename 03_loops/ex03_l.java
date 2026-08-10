import java.util.Scanner;
public class ex03_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(i%5==0){
                continue;
            }
            System.out.print(i + " ");
        }


        scanner.close();
    }
}