// 12. Print gender (Male/Female) program according to given M/F using switch
package Java_Assgn.Java_Loops;

import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character (M/F)  : ");

        char Gender = sc.next().charAt(0);

        switch (Gender) {
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
