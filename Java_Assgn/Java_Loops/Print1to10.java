// 7. Write a program to print 1 to 10 using the do-while loop statement.
package Java_Assgn.Java_Loops;

public class Print1to10 {
    public static void main(String[] args) {
        int i = 1;
        /*
         * The Java do-while loop is executed at least once because
         * condition is checked after loop body.
         */
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        // do-while checks the condition at the end of loop body

    }

}
