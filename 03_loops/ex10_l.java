
import java.util.Scanner;
public class ex10_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        int positives=0;
        int negatives=0;
        double total=0;

        do {
            System.out.print("Enter a number (0 to quit): ");
            num = scanner.nextInt();
            if (num==0) {
                break;
            }else if (num<0){
                negatives+=1;
                total+=num;
            }else {
                positives += 1;
                total += num;
            }

        }while (num!=0);
        double average=total/(negatives+positives);
        System.out.println("The number of positives:"+positives);
        System.out.println("The number of negatives:"+negatives);
        System.out.println("The total:"+total);
        System.out.println("The average:"+average);






        scanner.close();
    }
}