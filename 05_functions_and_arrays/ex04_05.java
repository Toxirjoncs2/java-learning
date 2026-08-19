import java.util.Scanner;
public class ex04_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        for (int i=0;i<10;i++){
            System.out.println("The frequency of "+i+" = "+countDigitOccurrences(num,i));
        }
        scanner.close();
    }
    static int countDigitOccurrences(int num,int digit){
        String newNum=String.valueOf(num);
        char newDigit=String.valueOf(digit).charAt(0);
        int count=0;
        for (int i=0;i<newNum.length();i++){
            if(newNum.charAt(i)==newDigit){
                count++;
            }
        }
        return count;
    }
}