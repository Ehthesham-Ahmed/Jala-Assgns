// 3. Program to equal operator and not equal operators
// 4. Write a program to find the two numbers equal or not.

package Java_Assgn.Java_Operators;

import java.util.Scanner;

public class EqualNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) { // == is used to compare if both are equal, gives true if equal
            System.out.println(a + " & " + b + " are equal");
        }

        if (a != b) { // != is used to compare if both aren't equal, gives true if not equal
            System.out.println(a + " & " + b + " are not equal");
        }

    }
}
