import java.util.Scanner;
import java.util.Random;
public class ex19_cf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int random=rand.nextInt(1,14);
        String [] options={"Clubs","Diamonds","Hearts","Spades"};
        int randIndex=rand.nextInt(0,4);
        String choice=options[randIndex];
        switch (random){
            case 1 -> System.out.print("Your card is Ace of ");
            case 2 -> System.out.print("Your card is 2 of ");
            case 3 -> System.out.print("Your card is 3 of ");
            case 4 -> System.out.print("Your card is 4 of ");
            case 5 -> System.out.print("Your card is 5 of ");
            case 6 -> System.out.print("Your card is 6 of ");
            case 7 -> System.out.print("Your card is 7 of ");
            case 8 -> System.out.print("Your card is 8 of ");
            case 9 -> System.out.print("Your card is 9 of ");
            case 10 -> System.out.print("Your card is 10 of ");
            case 11-> System.out.print("Your card is Jack of ");
            case 12-> System.out.print("Your card is Queen of ");
            case 13-> System.out.print("Your card is King of ");
            default -> System.out.println("Invalid card");
        }
        switch (choice){
            case "Clubs" -> System.out.print("Clubs");
            case "Diamonds" -> System.out.print("Diamonds");
            case "Hearts" -> System.out.print("Hearts");
            case "Spades" -> System.out.print("Spades");
            default -> System.out.print("Invalid card");

        }


        scanner.close();
    }
}

