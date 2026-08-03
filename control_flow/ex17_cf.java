import java.util.Scanner;
import java.text.DecimalFormat;
public class ex17_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.###");
        System.out.print("Enter the first number: ");
        double num1=scanner.nextDouble();
        System.out.print("Enter a arithmetic operator (+,-,*,/,^) : ");
        char operator=scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2=scanner.nextDouble();
        double result;
        String rounded;
        switch (operator){
            case '+':
                result=num1+num2;
                rounded=df.format(result);
                System.out.println(rounded);
                break;
            case '-':
                result=num1-num2;
                rounded=df.format(result);
                System.out.println(rounded);
                break;
            case '*':
                result=num1*num2;
                rounded=df.format(result);
                System.out.println(rounded);
                break;
            case '/':
                if(num2!=0) {
                    result = num1 / num2;
                    rounded=df.format(result);
                    System.out.println(rounded);
                }else{
                    System.out.println("You can't divide by zero");}
                break;
            case '^':
                result=Math.pow(num1,num2);
                rounded=df.format(result);
                System.out.println(rounded);
                break;
            default:
                System.out.println("Invalid operator");



        }










        scanner.close();

    }
}