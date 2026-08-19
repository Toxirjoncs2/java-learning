import java.util.Scanner;
public class ex09_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an alphabet letter: ");
        char c=scanner.next().charAt(0);
        revChar(c);
        scanner.close();
    }
    static void revChar(char c){
        char newChar;
        if(c>=65 && c<=90){
            newChar=(char)(c+32);
            System.out.println(newChar);
        } else if (c>=97 && c<=122) {
            newChar=(char)(c-32);
            System.out.println(newChar);
        }else
            System.out.println("It is not an alphabet letter");
    }
}