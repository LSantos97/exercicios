/*
* Crie uma classe Funcionário com os seguintes atributos
*
* nome
* idade
* salario // tres salarios devem ser guardados
* crie dois metodos
* para imprimir os dados
* para tirar a media dos salarios e imprimir o resultado
*
* */

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lohan";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{1200,987.32,2000};

        funcionario.imprime();
    }
}