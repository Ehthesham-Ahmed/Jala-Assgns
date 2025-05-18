// 10. Write a program to palindrome or not.
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class Pallindrome {
    static boolean palindromeNumber(int num) {
        int r, sum = 0, temp;
        // Copy number into a temporary variable and reverse it.
        temp = num;
        while (num > 0) {
            r = num % 10; // getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number : ");
        num = new Scanner(System.in).nextInt();

        if (palindromeNumber(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}
