// Class with overloaded methods
class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class CompileTimePolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(2, 3));
        System.out.println("Addition of 2 doubles: " + calc.add(3.4, 4.4));
        System.out.println("Addition of 3 integers: " + calc.add(4, 5, 3));
    }
}
