// 8. Write a program to find Armstrong number or not
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int r, result = 0;
        int temp = n;
        while (n != 0) {
            r = n % 10;
            /*
             * LOGIC : power of r for each individual and add those numbers
             * eg: 153 = 1^3 + 5^3 + 3^3 ==> 1 + 125 + 27 ==> 153
             */
            result += (r * r * r);
            n = n / 10;
        }
        // returns if orig and result are equal
        return temp == result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
