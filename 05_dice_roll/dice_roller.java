import java.util.Scanner;
import java.util.Random;
public class dice_roller {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Enter a number of dice to roll: ");
        int number=scanner.nextInt();
        int total=0;
        if (number<=0){
            System.out.println("Number should be greater than 0");
        }else {
            System.out.printf("Rolling %d dice...\n",number);
            for (int i=0;i<number;i++){
                int dice=random.nextInt(1,7);
                printDie(dice);
                System.out.printf("You rolled %d\n",dice);
                total+=dice;}
            System.out.println("Total is "+total);
        }
        scanner.close();
    }
    static void printDie(int dice){
        String dice1= """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
                """;
        String dice2= """
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------
                """;
        String dice3= """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
                """;
        String dice4= """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
                """;
        String dice5= """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
                """;
        String dice6= """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
                """;
        switch (dice){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid input");
        }
    }
}
