package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        /*byte dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Domingo -> Final de semana");
                break;
            case 7:
                System.out.println("Sabádo -> Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia Incorreto");
                break;
        }*/

        byte day = 2;

        switch (day) {

            case 1, 7:
                System.out.println("Final de semana!");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil!");
                break;
            default:
                System.out.println("ERRO");
                break;
        }

    }
}
