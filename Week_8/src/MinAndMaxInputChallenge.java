import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /*
    Read the numbers from the console entered by the user and print the minimum
    and maximum number the user has entered.
     */
    public static void main(String[] args) {
        minAndMax();
    }
    public static void minAndMax() {
        Scanner sc = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
            System.out.println("Enter Number: ");
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        } while (sc.hasNextInt());
        System.out.println("Mininum Number is : " + min);
        System.out.println("Maximum Number is : " + max);

    }

}
