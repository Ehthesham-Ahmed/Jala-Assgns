// 9. Write a program to find the prime or not. 
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class IsPrime {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Neither prime nor composite");
        }

        if (isPrime(a)) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " isn't a prime number");
        }
    }
}
