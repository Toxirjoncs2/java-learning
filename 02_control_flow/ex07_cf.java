import java.util.Scanner;
public class ex07_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char ch;
        String s;
        System.out.print("Enter a character: ");
        s=scanner.nextLine();
        ch=s.charAt(0);
        if (ch>=65 && ch<=90)
            System.out.print("Uppercase");
        else if (ch>=97 && ch<=122)
            System.out.print("Lowercase");
        else
            System.out.print("It's not an alphabet");


        scanner.close();

    }
}
