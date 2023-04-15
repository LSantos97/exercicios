import java.util.Scanner;

public class TrianguloCheck {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,C;

        System.out.print("Verificar Triangulo\n\n");

        System.out.print("Digite o lado A=");
        A = entrada.nextInt();

        System.out.print("Digite o lado B=");
        B = entrada.nextInt();

        System.out.print("Digite o lado C=");
        C = entrada.nextInt();

        if (A < B + C && B < A + C && C < A + B){
            if (A==B && B == C){
                System.out.print("O triângulo é Eqüilátero.");
            } else if (A==B || A==C || B==C) {
                System.out.print("O triângulo é Isósceles.");
            } else {
                System.out.print("O triângulo é Escaleno.");
            }
        }else {
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }
    }
}
