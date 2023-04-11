import java.util.Random;
import java.util.Scanner;

public class caixa {

    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();

    }
}
