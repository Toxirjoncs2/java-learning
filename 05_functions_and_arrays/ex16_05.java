import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex16_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.#");
        System.out.print("Enter a positive number: ");
        int num=scanner.nextInt();
        if (num>=0){
            int right;
            int left;
            int newNum=num*num;
            String uzunlik=String.valueOf(num);
            int result=1;
            for (int i=0;i<uzunlik.length();i++){
                result*=10;
            }
            right=newNum%result;
            left=newNum/result;
            if ((right+left)==Math.sqrt(newNum)){
                System.out.println(df.format(Math.sqrt(newNum))+" is a Kaprekar number");
            }else
                System.out.println(df.format(Math.sqrt(newNum))+" is not a Kaprekar number");
        }else{
            System.out.println("Number should be positive!");
        }
        scanner.close();
    }
}