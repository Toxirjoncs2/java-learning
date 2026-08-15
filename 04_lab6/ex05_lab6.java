import java.util.Scanner;
public class ex05_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] num=new int[4];
        int x;
        System.out.print("Enter decrypted 4-digit integer: ");
        String input=scanner.next();
        if (input.length()==4 && input.matches("\\d{4}")){
            int integer=Integer.parseInt(input);
            for (int i=3;i>=0;i--){
                num[i]=(integer%10+3)%10;
                integer/=10;
            }
            x=num[0];
            num[0]=num[2];
            num[2]=x;
            x=num[1];
            num[1]=num[3];
            num[3]=x;
            for (int j=0;j<4;j++){
                System.out.print(num[j]);
            }

        }else {
            System.out.println("Invalid input");
        }



        scanner.close();
    }
}