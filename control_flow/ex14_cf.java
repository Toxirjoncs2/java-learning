import java.util.Locale;
import java.util.Scanner;
public class ex14_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Choose the language: ");
        String choice=scanner.nextLine().toLowerCase();
        switch (choice){
            case "u" -> System.out.println("Assalomu aleykum!");
            case "e" -> System.out.println("Hello!");
            case "r" -> System.out.println("Zdrastvuyte!");
            case "g" -> System.out.println("Hallo!");
            default -> System.out.println("I don't know that language :(");
        }
        scanner.close();

    }
}
