import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int PrimeiroNumero, SegundoNumero, Diferenca;

        System.out.print("Verificador de números\n\n");

        System.out.print("Digite o primeiro número: ");
        PrimeiroNumero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        SegundoNumero = entrada.nextInt();

        if (PrimeiroNumero >= SegundoNumero){
           Diferenca = PrimeiroNumero - SegundoNumero;
        }else {
            Diferenca = SegundoNumero - PrimeiroNumero;
        }

        System.out.println("\nA diferença do maior para o menor é "+Diferenca);
    }
}
