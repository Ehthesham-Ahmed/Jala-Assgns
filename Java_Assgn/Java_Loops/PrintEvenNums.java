// 6. Write a  program to print even number between 10 and 100 using while 
package Java_Assgn.Java_Loops;

public class PrintEvenNums {
    public static void main(String[] args) {

        System.out.println("The Even Numbers between 10 and 100 are : ");
        int i = 10;
        // loop executes from 10 to 100
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }
    }
}
