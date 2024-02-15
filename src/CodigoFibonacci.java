public class CodigoFibonacci {

    public static void main(String[] args) {
        CodigoFibonacci fib = new CodigoFibonacci();

        System.out.println("Fibonacci com recursão:");
        for (int i = 0; i < 20; i++) {
            System.out.print(fib.calcularFibonacciRecursivo(i) + " ");
        }

        System.out.println("\n\nFibonacci com loop for:");
        for (int i = 0; i < 20; i++) {
            System.out.print(fib.calcularFibonacciFor(i) + " ");
        }

        System.out.println("\n\nFibonacci com loop while:");
        for (int i = 0; i < 20; i++) {
            System.out.print(fib.calcularFibonacciWhile(i) + " ");
        }
    }

    public int calcularFibonacciRecursivo(int n) {
        if (n <= 1)
            return n;
        else
            return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
    }

    public int calcularFibonacciFor(int n) {
        if (n <= 1)
            return n;
        int fibonacci = 1;
        int anteriorFibonacci = 0;
        for (int i = 2; i <= n; i++) {
            int temp = fibonacci;
            fibonacci += anteriorFibonacci;
            anteriorFibonacci = temp;
        }
        return fibonacci;
    }

    public int calcularFibonacciWhile(int n) {
        if (n <= 1)
            return n;
        int fibonacci = 1;
        int anteriorFibonacci = 0;
        int i = 2;
        while (i <= n) {
            int temp = fibonacci;
            fibonacci += anteriorFibonacci;
            anteriorFibonacci = temp;
            i++;
        }
        return fibonacci;
    }
}