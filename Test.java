// Simulating package college.students
class Student {
    public String name = "Rajashri";     // Public - accessible everywhere
    protected int roll = 27;             // Protected - accessible in same package or via inheritance
    private double marks = 92.5;         // Private - accessible only inside this class

    public void displayMarks() {
        System.out.println("Marks (private): " + marks);
    }
}

// Simulating package test
public class Test extends Student {
    public static void main(String[] args) {
        Student s = new Student();

        // Access public variable
        System.out.println("Name: " + s.name);

        // Access protected variable (via inheritance)
        Test t = new Test();
        System.out.println("Roll (protected via inheritance): " + t.roll);

        // Cannot directly access private variable
        // System.out.println(s.marks); // ❌ Compile-time error

        // Access private variable through public method
        s.displayMarks();
    }
}
