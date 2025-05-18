// 13. Program for multiple if else statement(Largest number  in 10,20 and 30)
package Java_Assgn.Java_Loops;

public class IfElse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println("Values of a, b, c: " + a + ", " + b + ", " + c);
        
        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");

        }
        
        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }
        
        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}
