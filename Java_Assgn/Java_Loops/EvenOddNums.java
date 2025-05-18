// 4. Write a program to print the odd and even numbers.
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class EvenOddNums {

    static void evenNumbers(int n) {
        System.out.println("Even Numbers from 0 to " + n);
        // loop executes until the condition becomes false
        for (int i = 0; i <= n; i++) {
            // If it is divided by 2,leaves remainder 0 then it is even number
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    static void oddNumbers(int n) {
        System.out.println("Odd Numbers from 1 to " + n);
        for (int i = 0; i <= n; i++) {
            
            // If the remainder is not equal to 0 then given number is odd number
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        num = sc.nextInt();
        evenNumbers(num);
        oddNumbers(num);
    }
}
