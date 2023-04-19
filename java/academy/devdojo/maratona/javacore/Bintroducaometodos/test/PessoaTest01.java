package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
//        pessoa.idade = 70;
        pessoa.setIdade(70);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println("------");
        int n1 = 10;
        int n2 = n1++;
        int n3 = ++n1;
        int resultado = n1 + n2 + n3;
        System.out.println(resultado);

    }
}
