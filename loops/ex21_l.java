import java.util.Scanner;
public class ex21_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=0;
        System.out.print("Enter an input:");
        int input=scanner.nextInt();
        while(Math.pow(2,num)<input){
            num+=1;
        }
        if(Math.pow(2,num)>input){
            num-=1;
        }
        System.out.println("Power is "+num);
        System.out.println("The number is "+Math.pow(2,num));


        scanner.close();
    }
}