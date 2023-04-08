public class Veiculos {
    public static void main(String[] args) {
                double distancia = 100.0; // Distância entre as cidades em KM
                double velocidadeCarro = 110.0; // KM/H
                double velocidadeCaminhao = 80.0; // KM/H
                double distanciaCarro = distancia / 2.0; // Trajeoto percorrido pelo carro até o encontro em KM
                double tempoCarro = distanciaCarro / velocidadeCarro;
                double tempoPedagio = 0.0833; // Tempo do caminhão no pedágio em horas 5 minutos
                double tempoCaminhao = (distancia - distanciaCarro) / velocidadeCaminhao + 2.0 * tempoPedagio;

                if (tempoCarro < tempoCaminhao) {
                    System.out.println("O carro está mais próximo da cidade de Ribeirão Preto.");
                } else {
                    System.out.println("O caminhão está mais próximo da cidade de Ribeirão Preto.");
                }
            }
        }

        /* tempo = distância / velocidade
            * Velocidade média do carro = Distância percorrida / Tempo
            * 110 = 100 / Tempo
            * Tempo = 100 / 110
            * Tempo = 0,91 horas (ou aproximadamente 54,6 minutos)
            *
            * Velocidade média do caminhão = Distância percorrida / Tempo
            * 80 = 100 / (Tempo + 0,17)
            * Tempo + 0,17 = 100 / 80
            * Tempo + 0,17 = 1,25
            * Tempo = 1,25 - 0,17
            * Tempo = 1,08 horas (ou aproximadamente 64,8 minutos)
            *
            *
            * */


