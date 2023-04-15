import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Quantidade = 6;
        int[] Numeros = new int[Quantidade];

        System.out.print("Ordenador de números\n\n");

        for (int x = 0; x < Quantidade; x++) {
            System.out.print("Digite o " + (x + 1) + " número: ");
            Numeros[x] = entrada.nextInt();
        }

        Arrays.sort(Numeros);

        System.out.println("\n\nOs números em ordem crescente são:");
        for (int Numero : Numeros) {
            System.out.println(Numero);

        }
    }
}
