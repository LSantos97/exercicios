package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isMaiorDeIdade = idade >= 18;

        if (isMaiorDeIdade) {
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }

        // ! no inicio funciona do mesmo jeito que == a algo false
       /* if(!isMaiorDeIdade){
            System.out.println("Menor de idade!");
        }
        */
    }
}
