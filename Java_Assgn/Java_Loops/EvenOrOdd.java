// 11. Program to check whether a number is EVEN or ODD using switch
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        switch (n % 2) {
            // Even number has a remainder of 0 if divided by 2
            case 0:
                System.out.println(n + " is an Even Number");
                break;
            // Odd number has a remainder of 1 if divided by 2
            case 1:
                System.out.println(n + " is an Odd Number");
                break;
        }
    }
}
