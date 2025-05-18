// 1. Write a function for arithmetic operators(+,-,*,/)


package Java_Assgn.Java_Operators;
import java.util.Scanner;

public class ArithmaticOperators {

    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers " + a + " and " + b + " is: " + sum(a, b));
        System.out.println("Difference of two numbers " + a + " and " + b + " is: " + sub(a, b));
        System.out.println("Product of two numbers " + a + " and " + b + " is: " + mul(a, b));
        System.out.println("Division of two numbers " + a + " and " + b + " is: " + div(a, b));
    }
}
