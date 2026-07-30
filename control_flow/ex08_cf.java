import java.util.Scanner;
public class ex08_cf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter x: ");
        x= scanner.nextInt();
        System.out.print("Enter y: ");
        y= scanner.nextInt();
        if(Math.pow(x,2)+Math.pow(y,2)<=100)
            System.out.printf("Point (%d,%d) is in the circle",x,y);
        else
            System.out.printf("Point (%d,%d) is not in the circle",x,y);


        scanner.close();

    }
}
