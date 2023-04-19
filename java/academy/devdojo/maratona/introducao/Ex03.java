package academy.devdojo.maratona.introducao;

import java.util.Date;

public class Ex03 {
    public static void main(String[] args) {

        Date hora = new Date();
        hora.getTime();

        double salary = 20000;
        double resultado = 0;
        double brl = 5.56;

        if (salary<=34712){
            resultado = (salary*9.70)/100;

        }else if (salary<=68507) {
            resultado = (salary*37.35)/100;

        }else resultado = (salary*49.50)/100;

        System.out.println("Imposto atual é de €"+resultado);

        System.out.println("Convertendo Euro para Real resulta em R$"+resultado*brl+" "+hora);
    }
}
