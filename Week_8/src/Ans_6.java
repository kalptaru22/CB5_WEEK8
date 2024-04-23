import java.util.Scanner;

public class Ans_6 {
    public static void main(String[] args) {
        numberTriangle();

    }

    private static void numberTriangle() {
        System.out.println("Enter Number of Rows :  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i, b;
        for (i = 1; i <= a; i++) {
            for (b = 1; b <= i; b++)
                System.out.print(i);
            System.out.println("");

        }
    }

}
