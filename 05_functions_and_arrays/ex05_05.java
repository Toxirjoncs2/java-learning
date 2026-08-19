import java.util.Scanner;
public class ex05_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        digitToWord(num);
        scanner.close();
    }
    static void digitToWord(int num){
        String newNum=String.valueOf(num);
        for (int i=0;i<newNum.length();i++){
            switch (newNum.charAt(i)){
                case '0'-> System.out.print("zero ");
                case '1'-> System.out.print("one ");
                case '2'-> System.out.print("two ");
                case '3'-> System.out.print("three ");
                case '4'-> System.out.print("four ");
                case '5'-> System.out.print("five ");
                case '6'-> System.out.print("six ");
                case '7'-> System.out.print("seven ");
                case '8'-> System.out.print("eight ");
                case '9'-> System.out.print("nine ");
            }
        }
    }
}