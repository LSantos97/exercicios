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
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }
}
