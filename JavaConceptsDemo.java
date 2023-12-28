public class JavaConceptsDemo {
    public static void main(String[] args) {
        // If-else statement
        int age = 25;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // For loop
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        // Mathematical and comparison operations
        int x = 10;
        int y = 5;
        int result = x + y; // Addition
        System.out.println("Addition: " + result);

        boolean isGreaterThan = x > y; // Comparison
        System.out.println("Is x greater than y? " + isGreaterThan);

        // Increment operation
        int count = 0;
        count++; // Increment by 1
        System.out.println("Count: " + count);

        // Exception handling
        try {
            int divisor = 0;
            int quotient = x / divisor; // ArithmeticException will be thrown
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }

        // Heap vs. Stack memory
        String heapString = new String("Heap Memory"); // String object in heap
        int stackNumber = 42; // Primitive int in stack

        // Big O notation
        // O(1) - Constant time complexity (e.g., accessing an element in an array)
        // O(n) - Linear time complexity (e.g., iterating through an array)
        // O(n^2) - Quadratic time complexity (e.g., nested loops)

        // Performance vs. Scalability
        // Performance focuses on improving the speed of a system.
        // Scalability focuses on handling increased load by adding resources or nodes.

        // Agile vs. Waterfall
        // Agile is an iterative and flexible approach to software development.
        // Waterfall is a sequential and structured approach to software development.

        // Note: Uncomment code or add your own to observe and test each concept.
    }
}
