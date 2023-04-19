package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 1000000) {
            if (count % 2 == 0) {
                System.out.println(count);
                count += 2;
            }


        }
    }
}
