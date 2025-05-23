package Java_Assgn.Java_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SpecificValue {
    static boolean contains(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        int[] arr = { 11, 22, 33, 44, 55 };
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the value which should be searched : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        boolean hasValue = contains(arr, n);

        if (hasValue) {
            System.out.println("Contains " + n + " in the array");

        } else {
            System.out.println("Does not Contains " + n + " in the array");

        }
    }
}
