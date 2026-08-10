import java.util.Scanner;
public class ex11_cf     {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a color: ");
        String color=scanner.nextLine().toLowerCase();
        switch (color){
            case "g" -> System.out.println("Go!");
            case "y" -> System.out.println("Get ready!");
            case "r" -> System.out.println("Stop!");
            default -> System.out.println("Invalid input");
        }


    }
}
