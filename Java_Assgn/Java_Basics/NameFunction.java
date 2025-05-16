// 6. Write a function to print your name and call the function from main method

package Java_Assgn.Java_Basics;

import java.util.Scanner;

public class NameFunction {
    void printName(String s) {
        System.out.println("Your name is: " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = sc.nextLine();
        NameFunction obj = new NameFunction();
        obj.printName(name);

    }
}
