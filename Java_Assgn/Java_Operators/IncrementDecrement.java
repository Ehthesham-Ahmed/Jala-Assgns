// 2. Write a method for increment and decrement operators(++, --) 

package Java_Assgn.Java_Operators;

public class IncrementDecrement {

    static void preIncrement(int a, int b) {
        int k = b + (++a);  // a is icremented and added to b
        System.out.println("a, Sum after pre-increment of a: " + a + ", " + k);
    }
    static void postIncrement(int a, int b) {
        int k = b + (a++);  // a is icremented after added to b
        System.out.println("a, Sum after post-increment of a: " + a + ", " + k);
    }
    static void preDecrement(int a, int b) {
        int k = b + (--a);  // a is decremented and added to b
        System.out.println("a, Sum after post-increment of a: " + a + ", " + k);
    }
    static void postDecrement(int a, int b) {
        int k = b + (a--);  // a is decremented after added to b
        System.out.println("a, Sum after post-increment of a: " + a + ", " + k);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Values a, b: " + a + ", " + b);
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);

    }
}
