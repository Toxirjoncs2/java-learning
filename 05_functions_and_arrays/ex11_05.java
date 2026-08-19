import java.util.Scanner;
public class ex11_05  {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] fruits={"apple","banana","peach"};
        String[] vegetables={"tomato","cucumber","melon"};
        String[] drinkings={"cola","fanta","pepsi"};
        String[][] groceries={fruits,vegetables,drinkings};
        for (String[] foods : groceries){
            for(int i=0;i<foods.length;i++){
                System.out.print(foods[i]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}