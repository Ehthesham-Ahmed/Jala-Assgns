package Java_Assgn.Java_Basics;
// import scaneer classs from java.util package to take input
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // create new scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yoyr name: ");
        // read input, and store in name variable
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
