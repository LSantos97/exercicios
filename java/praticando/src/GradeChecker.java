import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PrimeiraNota, SegundaNota, TerceiraNota, QuartaNota, RecuperacaoNota, Media;
        boolean Aprovacao = false;

        System.out.print("Verificador de notas\n\n");

        System.out.print("Digite a primeira nota: ");
        PrimeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        SegundaNota = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        TerceiraNota = entrada.nextDouble();

        System.out.print("Digite a quarta nota: ");
        QuartaNota = entrada.nextDouble();

        Media = (PrimeiraNota + SegundaNota + TerceiraNota + QuartaNota) / 4;

        if (Media >= 7) Aprovacao = true;
        else {
            System.out.print("O aluno ficou de recuperação, digite a nota: ");
            RecuperacaoNota = entrada.nextDouble();
            Media = (Media + RecuperacaoNota) / 2;
            if (Media >= 7) Aprovacao = true;
        }

        if (Aprovacao) {
            System.out.println("\n\nO aluno foi aprovado com a média: " + Media);
        } else {
            System.out.println("\n\nO aluno foi reprovado com a média: " + Media);
        }
    }
}
