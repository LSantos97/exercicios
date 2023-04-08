/*
int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
K = K + 1;
SOMA = SOMA + K;
imprimir(SOMA);
*/

public class SOMA {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE){
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println(SOMA);
        }



    }
}

