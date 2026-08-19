import java.util.Scanner;
public class ex03_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        System.out.print("Enter a digit:");
        int digit=scanner.nextInt();
        if (countDigitOccurrences(num,digit)>0) {
            System.out.printf("%d occured %d times in %d", digit, countDigitOccurrences(num, digit), num);
        }
        else
            System.out.printf("%d didn't occur in %d",digit,num);
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