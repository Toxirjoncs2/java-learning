import java.text.DecimalFormat;
import java.util.Scanner;
public class ex13_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.###");
        int num;
        System.out.print("Enter a number:");
        num=scanner.nextInt();
        double result=sqrt(num);
        System.out.println(df.format(result));
        scanner.close();
    }
    static double sqrt(int n){
        double lastGuess=1;
        double nextGuess = (lastGuess + (n / lastGuess)) / 2;
        while (Math.abs(nextGuess-lastGuess)>0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
        }
        return lastGuess;
    }
}