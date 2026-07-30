import java.util.Scanner;
public class ex12_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int today;
        int days;
        int future;
        System.out.print("Enter today's day:");
        today=scanner.nextInt()%7;
        System.out.print("Enter the number of days elapsed since today:");
        days=scanner.nextInt()%7;
        future=today+days;

        switch (today){
            case 0 -> System.out.print("Today is Sunday and ");
            case 1 -> System.out.print("Today is Monday and ");
            case 2 -> System.out.print("Today is Tuesday and ");
            case 3 -> System.out.print("Today is Wednesday and ");
            case 4 -> System.out.print("Today is Thursday and ");
            case 5 -> System.out.print("Today is Friday and ");
            case 6 -> System.out.print("Today is Saturday and ");
        }
        switch (future){
            case 0 -> System.out.print("the future day is Sunday");
            case 1 -> System.out.print("the future day is Monday");
            case 2 -> System.out.print("the future day is Tuesday");
            case 3 -> System.out.print("the future day is Wednesday");
            case 4 -> System.out.print("the future day is Thursday");
            case 5 -> System.out.print("the future day is Friday");
            case 6 -> System.out.print("the future day is Saturday");
        }

        scanner.close();


    }
}
