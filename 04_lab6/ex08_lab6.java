import java.util.Scanner;
public class ex08_lab6  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=scanner.nextInt();
        System.out.print("Enter a month (1-12):");
        int month=scanner.nextInt();
        if (month>0 && month<=12) {
            System.out.print("Enter a day (1-31):");
            int day = scanner.nextInt();
            if (month==1 || month==2) {
                month += 12;
                year -= 1;
            }
            int dayOfTheWeek=(day+26*(month+1)/10+(year%100)+(year%100)/4+(year/100)/4+5*(year/100))%7;
            switch (dayOfTheWeek){
                case 0 -> System.out.println("Day of the week is Saturday");
                case 1 -> System.out.println("Day of the week is Sunday");
                case 2 -> System.out.println("Day of the week is Monday");
                case 3 -> System.out.println("Day of the week is Tuesday");
                case 4 -> System.out.println("Day of the week is Wednesday");
                case 5 -> System.out.println("Day of the week is Thursday");
                case 6 -> System.out.println("Day of the week is Friday");
                default -> System.out.println("Error");
            }


        }else
            System.out.print("Month should be between 1-12");


        scanner.close();
    }
}