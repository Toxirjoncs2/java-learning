import java.util.Scanner;
public class ex15_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] chars=new int[8];
        int code;
        int key=95;
        for (int i=0;i<8;i++){
            System.out.println("Enter code"+(i+1)+": ");
            code=scanner.nextInt();
            chars[i]=decryption(code,key);
        }
        System.out.println("Key: "+key);
        for (int i=0;i<8;i++){
            char c=(char) chars[i];
            System.out.print(c);
        }
        scanner.close();
    }
    static int decryption(int code,int key){
        int result=code+(3*key*key/10);
        return result;
    }
}