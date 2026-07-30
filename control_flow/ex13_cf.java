import java.util.Scanner;
public class ex13_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your score: ");
        int grade=scanner.nextInt();
        if (grade<0 || grade>100){
            System.out.println("Invalid score");
        }else{
            grade/=10;
            switch (grade) {
                case 10 -> System.out.println("Your grade is A");
                case 9 -> System.out.println("Your grade is A");
                case 8 -> System.out.println("Your grade is B");
                case 7 -> System.out.println("Your grade is C");
                case 6 -> System.out.println("Your grade is D");
                default -> System.out.println("Your grade is F");
            }
        }





        scanner.close();

    }
}
