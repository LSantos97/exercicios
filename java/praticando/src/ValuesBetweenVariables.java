import java.util.Scanner;

public class ValuesBetweenVariables {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, VariavelTemporaria;

        System.out.print("Efetuador de troca de valores entra variaveis\n\n");

        System.out.print("Digite a variável A: ");
        A = entrada.nextInt();

        System.out.print("Digite a variável B: ");
        B = entrada.nextInt();

        VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.print("A= " + A + " | B= " + B + "\n");
    }
}
