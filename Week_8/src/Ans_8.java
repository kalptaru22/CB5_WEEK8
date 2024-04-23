public class Ans_8 {
    /*
    Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
     */

    public static void main(String[] args) {
        rightTriangle();
    }

    private static void rightTriangle() {
        for (int i = 0; i <6; i++){
            for (int t=0; t<=i; t++)
                System.out.print("@");
            System.out.println("");

        }
    }

}
