// Define Printable interface
interface Printable {
    void print();
}

// Define Showable interface
interface Showable {
    void show();
}

// Student class implementing both interfaces
class Student implements Printable, Showable {
    String name;
    int roll;
    double marks;

    // Constructor
    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Implement print() from Printable interface
    public void print() {
        System.out.println("Printing Student Details...");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }

    // Implement show() from Showable interface
    public void show() {
        System.out.println("Showing Student Information...");
        System.out.println("Name: " + name + " | Roll No: " + roll + " | Marks: " + marks);
    }
}

// Main class to test
public class InterfaceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rajashri Kalshetti", 27, 92.5);

        // Calling methods from both interfaces
        s1.print();
        System.out.println();
        s1.show();
    }
}
