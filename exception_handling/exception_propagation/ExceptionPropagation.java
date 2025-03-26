package exception_handling.exception_propagation;

public class ExceptionPropagation {
        // Method that throws an exception
        static void method1() {
            throw new ArithmeticException("Division by zero");
        }
    
        // Method calling method1
        static void method2() {
            method1();
        }
    
        public static void main(String[] args) {
            try {
                method2(); // Exception propagates here
            } catch (ArithmeticException e) {
                System.out.println("Handled exception in main");
            }
        }
    
}
