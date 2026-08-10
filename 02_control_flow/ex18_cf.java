import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class ex18_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter your guess (odd/even) : ");
        String choice=scanner.nextLine().toLowerCase();
        int random= rand.nextInt(1,101);
        if (random%2==0){
            if(choice.equals("even")){
                System.out.println("You won!");

            }else{
                System.out.println("You lost! It was even");
            }
        }else{
            if(choice.equals("odd")){
                System.out.println("You won!");

            }else {
                System.out.println("You lost! It was odd");
            }
        }
        System.out.print(random);




        scanner.close();

    }
}
