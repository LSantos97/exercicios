package academy.devdojo.maratona.introducao;

public class Ex01 {
    public static void main(String[] args) {

        double salarioAnual = 50_000;
        double taxa;
        double taxaValor;

        if (salarioAnual < 34_713){
            taxa = 9.70;
        } else if (salarioAnual < 68_508) {
            taxa = 37.35;

        }else {
            taxa = 49.50;
        }

        taxaValor = (salarioAnual*taxa)/100;
        System.out.println(taxaValor);

    }
}
