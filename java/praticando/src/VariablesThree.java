import java.util.Arrays;
import java.util.Scanner;

public class VariablesThree {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.print("Verificador de variáveis\n\n");

        for (int x= 0; x <3; x++){
            System.out.print("Digite o valor "+(x+1)+": ");
            valores[x] = entrada.nextInt();
            while (valores[x]<=0){
                System.out.print("Digite um valor válido "+(x+1)+": ");
                valores[x] = entrada.nextInt();
            }
        }
        Arrays.sort(valores);
        System.out.print("Exibe o menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2])+" E o maior valor dividido pelo menor: "+(valores[2]/valores[0]));
    }
}
