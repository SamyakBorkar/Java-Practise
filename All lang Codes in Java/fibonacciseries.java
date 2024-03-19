public class fibonacciseries {
        public static void main(String[] args) {
            int n = 10;
            generateFibonacciSeries(n);
        }
    
        public static void generateFibonacciSeries(int n) {
            int a = 0, b = 1;
            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        }
    
    
}
