import java.util.Scanner;

public class Ans_3 {
    /*
    Write a Java program that takes the user to provide a single character from the
    alphabet. Print Vowel of Consonant, depending on the user input. If the user input
    Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
    error message.
     */
    public static void main(String[] args) {
        alphabet();
    }

    public static void alphabet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char ch = sc.next().charAt(0);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            System.out.println("Entered character "+ch+" is  Vowel");
        } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
            System.out.println("input character " + ch +" is a Consonant");
        } else {
            System.out.println("Not an alphabet");
        }
    }


}
