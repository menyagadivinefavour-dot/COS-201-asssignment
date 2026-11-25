import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] args) {
        int count = 100;
        
        // Initialize the first two numbers of the sequence
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First " + count + " numbers of the Fibonacci sequence:");

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ": " + first);

            // Calculate the next number in the sequence
            BigInteger next = first.add(second);
            
            // Shift the values for the next iteration
            first = second;
            second = next;
        }
    }
}
