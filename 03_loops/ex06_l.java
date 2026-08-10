import java.util.Scanner;
public class ex06_l  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of classes: ");
        int num=scanner.nextInt();
        double totalCredits=0;
        double totalPoints=0;
        for(int i=0;i<num;i++){
            System.out.printf("Enter the credit and score for course %d: ",num);
            int credit1=scanner.nextInt();
            double score=scanner.nextDouble();
            totalCredits+=credit1;
            totalPoints+=credit1*score;}
        double gpa=totalPoints/totalCredits;
        System.out.println(gpa);






        scanner.close();
    }
}