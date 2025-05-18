// 7. Print the smaller and larger number 
package Java_Assgn.Java_Operators;

import java.util.Scanner;

public class CompareNums {
    static int max(int a, int b) {
        return ((a > b) ? a : b); // if a > b then returns a else b
    }

    static int min(int a, int b) {
        return ((a < b) ? a : b); // if a < b then returns a else b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("Both are equal");
        }
        System.out.println("Maximum number is: " + max(a, b));
        System.out.println("Minimum number is: " + min(a, b));
    }
}
