public class Inverter {
        public static void main(String[] args) {
            String entrada = "Target Sistemas";
            StringBuilder sb = new StringBuilder();

            for (int i = entrada.length() - 1; i >= 0; i--) {
                sb.append(entrada.charAt(i));
            }

            String strInvertida = sb.toString();

            System.out.println("String original: " + entrada);
            System.out.println("String invertida: " + strInvertida);
        }
    }
