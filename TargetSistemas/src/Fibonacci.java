import java.util.Scanner;

public class Fibonacci {
    public Fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int[] fib = new int[num+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= num; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        boolean pertence = false;
        int posicao = 0;
        for (int i = 0; i <= num; i++) {
            if (fib[i] == num) {
                pertence = true;
                posicao = i + 1;
                break;
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci na posição " + posicao + ".");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static void main(String[] args) {
        Fibonacci mainFibonacci = new Fibonacci();
    }
}
