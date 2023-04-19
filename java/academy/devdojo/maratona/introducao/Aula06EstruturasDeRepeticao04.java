package academy.devdojo.maratona.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do carro:");
        double valor = entrada.nextDouble();
        double valorDaParcela = 1000;

        double QuantDeVezes = valor / valorDaParcela;
        double valorDaParcelaTotal = valor / QuantDeVezes;

        System.out.print("O carro poderá ser dividido em até " + QuantDeVezes + " vezes sem juros. Valor da parcela é de: " + valorDaParcelaTotal + "R$");

    }
}
