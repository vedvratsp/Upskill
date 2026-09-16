public class ErrorHandling {

    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result); // This line won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Catch and handle the specific exception (ArithmeticException in this case)
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Code in this block will always be executed, regardless of whether an exception occurs or not
            System.out.println("This is the finally block.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        // Method that may throw an exception
        return numerator / denominator;
    }
}