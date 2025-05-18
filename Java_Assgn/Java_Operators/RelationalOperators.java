// 6. Program for relational operators (<,<==, >, >==)
package Java_Assgn.Java_Operators;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a, b: " + a + ", " + b);
        System.out.println("is a < b " + (a < b)); // less than ( < )
        System.out.println("is a > b " + (a > b)); // greater than ( > )
        System.out.println("is a <= b " + (a <= b)); // less than or equals( <= )
        System.out.println("is a >= b " + (a >= b)); // greater than or equals( >= )

    }
}