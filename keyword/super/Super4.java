class A {
    A() {
        // Default constructor of class A
    }

    A(int value) {
        // Parameterized constructor of class A
        System.out.println("A's parameterized constructor called with value: " + value);
    }

    void method1() {
        System.out.println("Method 1 in class A");
    }

    void method2(int value) {
        System.out.println("Method 2 in class A with value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("Example using class A:");
        A a = new A();
        A b = new A(42);
        a.method1();
        a.method2(10);
    }
}

class B extends A {
    B() {
        super(); // Calls the default constructor of class A
    }

    B(int value) {
        super(value); // Calls the parameterized constructor of class A
        System.out.println("B's parameterized constructor called with value: " + value);
    }

    @Override
    void method1() {
        super.method1(); // Calls the method1 from class A
        System.out.println("Method 1 in class B");
    }

    @Override
    void method2(int value) {
        super.method2(value); // Calls the method2 from class A
        System.out.println("Method 2 in class B with value: " + value);
    }

    public static void main(String[] args) {
        System.out.println("\nExample using class B:");
        B b = new B();
        b.method1();
        b.method2(20);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of both classes and call their methods
        A a = new A(100);
        a.method1();
        a.method2(50);

        B b = new B(200);
        b.method1();
        b.method2(75);
    }
}
