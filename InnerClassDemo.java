// Interface for anonymous inner class
interface MyInterface {
    void display();
}

// Outer class
class Outer {

    // Inner class
    class Inner {
        void show() {
            System.out.println("This is inner class.");
        }
    }

    // Method in outer class to access inner class
    void accessInner() {
        Inner innerObj = new Inner(); // Create object of Inner class
        innerObj.show();              // Call inner class method
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        // Create object of Outer class
        Outer outerObj = new Outer();

        // Access inner class method from outer class method
        outerObj.accessInner();

        // Anonymous inner class implementing MyInterface
        MyInterface obj = new MyInterface() {
            public void display() {
                System.out.println("This is anonymous class");
            }
        };

        // Call the display method
        obj.display();
    }
}
