// 1. How to create a class, object, method and its signature.
// create class using public class <class_name>
// class name and file name must be same if class is declared as public

public class classObjectMeth {
    // create method using public static <return_type> <method_name>()
    // a static method can't call non-static methods
    public static void display() {
        System.out.println("This is display() method");
    }
    public static void main(String[] args) {
        // object of a class is created by <class_name> <object_name> = new <class_name>(); 
        classObjectMeth obj = new classObjectMeth();
        obj.display();
        System.out.println("This is main class print statement");
    }
}