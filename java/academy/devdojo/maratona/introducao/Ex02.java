package academy.devdojo.maratona.introducao;

public class Ex02 {
    public static void main(String[] args) {

        double salario = 50000;
        double resultado = 0;

        if (salario<=34712){
            resultado = (salario*9.7)/100;
        } else if (salario>=34712) {
            resultado = (salario*37.35)/100;

        }else {
            resultado = (salario*49.50)/100;
        }
        System.out.println("O imposto sobre o seu salário anual será de €"+resultado+", continue contribuindo, para um País melhor!");

    }
}
