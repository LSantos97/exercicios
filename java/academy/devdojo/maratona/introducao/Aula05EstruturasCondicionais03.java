package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? "E vou realizar a doação de R$500" : "Ainda não tenho condições, mais vou ter!";
        //boolean possoDoar = salario > 5000 ? true : false
        System.out.println(resultado);
    }
}
