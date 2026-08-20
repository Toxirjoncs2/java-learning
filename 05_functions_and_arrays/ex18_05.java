import java.util.Scanner;
public class ex18_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=scanner.nextInt();
        int century;
        if (year%100==0){
            century=year/100;
        }else{
            century=year/100+1;
        }
        System.out.println(century);
        scanner.close();
    }
}