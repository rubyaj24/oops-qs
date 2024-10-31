//try catch statement

public class test {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            // System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}