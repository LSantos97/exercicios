import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        // Média de corte: 6
        //(media >= 6) -> Aprovado ou caso seja (< 6) Reprovado!

        Scanner scPrimeiroNum = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float primeiraNota = scPrimeiroNum.nextInt();

        Scanner scSegundoNum = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float segundaNota = scSegundoNum.nextInt();

        float mediaNota = (primeiraNota+segundaNota)/2;
        System.out.println("Sua média é: "+ mediaNota);
        if (mediaNota >= 6){
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }



    }
}
