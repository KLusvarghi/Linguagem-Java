package vetores.exerciciosvetores;

import java.util.Scanner;

import javax.sound.sampled.FloatControl;

// Criar um programa que receba a temperatura média de cada mês do ano, em graus
// centígrados, e armazene essas temperaturas em um vetor. Imprimir as temperaturas de
// todos os meses, maior e a menor temperatura do ano e em que mês aconteceram. Suponha
// que não há meses com temperaturas iguais.

public class ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] temperatura = new int[12];
        float maiorTemp = 0;
        float menorTemp = 1000;
        int diaMaior = 1;
        int diaMenor = 1;
        System.out.println("Digite a temperatura dos meses do ano:");
        System.out.println();
        for (int i = 0; i < temperatura.length; i++) {
            System.out.printf("Mes %d: ", (i + 1));
            temperatura[i] = in.nextInt();
            if (temperatura[i] > maiorTemp) {
                maiorTemp = temperatura[i];
                diaMaior = (i + 1);
            }
            if (temperatura[i] < menorTemp) {
                menorTemp = temperatura[i];
                diaMenor = (i + 1);
            }
        }
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Fizeram " + temperatura[i] + "cº no " + (1 + i) + "º mês.");
        }
        System.out.println("O " + diaMaior + "º mês foi o mais quente com " + maiorTemp + "ºc");
        System.out.println("O " + diaMenor + "º mês foi o mais frio com " + menorTemp + "ºc");
    }
}
