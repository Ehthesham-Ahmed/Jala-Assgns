// 5. Write a program to print largest number among three numbers. 
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class LargestNumber {
    static int max(int a, int b, int c) {
        return ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum of three numbers: " + max(a, b, c));
    }
}
