import java.util.Scanner;
public class ex12_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] questions={"1.What is the chemical symbol for gold?",
                              "2.How many planets are in our solar system?",
                              "3.What is the capital city of France?",
                              "4.Which gas do plants use most for photosynthesis?",
                              "5.What is the largest ocean on Earth?"};
        String[][] options={{"1: Ag", "2: Au", "3: Pb", "4: Fe"},
                            {"1: 7", "2: 8", "3: 9", "4: 10"},
                            {"1: London", "2: Berlin", "3: Paris", "4: Madrid"},
                            {"1: Oxygen", "2: Nitrogen", "3: Carbon dioxide", "4: Hydrogen"},
                            {"1: Atlantic", "2: Indian", "3: Arctic", "4: Pacific"}};
        int[] answers={2,2,3,3,4};
        int guess;
        int total=0;
        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess=scanner.nextInt();
            if (guess==answers[i]){
                System.out.println("Correct!");
                total++;
            }else
                System.out.println("Wrong!");
        }
        System.out.println("Your total is "+total+" out of 5");
        scanner.close();
    }
}