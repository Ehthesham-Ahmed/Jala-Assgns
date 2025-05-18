package Java_Assgn.Java_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 30;
        int b = 15;
        int c = 10;
        System.out.println("a, b, c: " + a +", " + b + ", " +c);

        // Logical AND (&&)
        /*
         * The logical && operator doesn't check the second condition if the first condition is false.
         * It checks the second condition only if the first one is true.
         */
        System.out.println("Logical AND (&&): ");
        System.out.println(a > b && a > c); // true && true = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true && false = false

        // Logical OR (||)
        /*
         * The logical || operator doesn't check the second condition if the first condition is true.
         * It checks the second condition only if the first one is false.
         */
        System.out.println("Logical OR (||): ");
        System.out.println(a > b || a > c); // true || true = true
        System.out.println(a < b || a < c); // false || false = false
        System.out.println(a < b || a > c); // false || true = true

        // Logical NOT [!()]
        System.out.println("Logical NOT (!): ");
        System.out.println(!(a > b)); // NOT true = false
        System.out.println(!(a < b)); // NOT false = true
    }
}
