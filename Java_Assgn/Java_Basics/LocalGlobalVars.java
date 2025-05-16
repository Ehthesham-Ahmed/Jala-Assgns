// 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
package Java_Assgn.Java_Basics;

public class LocalGlobalVars {
    // Instance variables are declared inside a class but outside a method
    int i = 10;

    void localVar() {
        // local variables are declared inide a method
        int i = 25;
        System.out.println("This is local variable: " + i);
    }

    public static void main(String[] args) {
        // object creation
        LocalGlobalVars obj = new LocalGlobalVars();
        System.out.println("Instance variable: " + obj.i);
        obj.localVar();
    }

}
