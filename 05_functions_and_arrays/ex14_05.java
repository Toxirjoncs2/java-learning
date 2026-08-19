import java.util.Scanner;
import java.util.Random;
public class ex14_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int[] numbers=new int[8];
        char a;
        int k=random.nextInt(10,100);
        System.out.print("Enter 8 characters: ");
        String input=scanner.nextLine();
        if (input.length()!=8){
            System.out.println("You need to enter 8 characters!");
        }else {
            for (int i=0;i<8;i++){
                a=input.charAt(i);
                numbers[i]=encryption(a,k);
            }
            for (int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
            System.out.println("Key:"+k);
        }
        scanner.close();
    }
    static int encryption(char a,int k){
        int value=a;
        int result=value-(3*k*k/10);
        return result;
    }
}