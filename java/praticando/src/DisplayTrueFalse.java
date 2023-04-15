import java.util.Scanner;

public class DisplayTrueFalse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int FirstNumber, SecondNumber;
        boolean Equal=false, NotEqual=false, Bigger=false, Smaller=false, BiggerOrEqual=false, SmallerOrEqual=false;

        System.out.print("Mostrador de relacionamentos\n\n");

        System.out.print("Digite o primeiro número: ");
        FirstNumber = input.nextInt();

        System.out.print("Digite o segundo número: ");
        SecondNumber = input.nextInt();

        if (FirstNumber == SecondNumber) Equal = true;
        if (FirstNumber != SecondNumber) NotEqual = true;
        if (FirstNumber > SecondNumber) Bigger = true;
        if (FirstNumber < SecondNumber) Smaller = true;
        if (FirstNumber >= SecondNumber) BiggerOrEqual = true;
        if (FirstNumber <= SecondNumber) SmallerOrEqual = true;

        System.out.println("\nIgual = "+Equal);
        System.out.println("Não Igual = "+NotEqual);
        System.out.println("Maior = "+Bigger);
        System.out.println("Menor = "+Smaller);
        System.out.println("Maior ou Igual = "+BiggerOrEqual);
        System.out.println("Menor ou igual = "+SmallerOrEqual);
    }
}