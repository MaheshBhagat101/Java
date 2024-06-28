public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("First " + n + " terms of Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}