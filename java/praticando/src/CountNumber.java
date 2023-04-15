import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CODIGO;

        System.out.print("Verificador de código\n\n");

        System.out.print("Digite um código de 1 a 4: ");
        CODIGO = entrada.nextInt();

        switch (CODIGO) {
            case 1 -> System.out.print("Um");
            case 2 -> System.out.print("Dois");
            case 3 -> System.out.print("Três");
            case 4 -> System.out.print("Quatro");
            default -> System.out.print("Código inválido");
        }
    }
}
