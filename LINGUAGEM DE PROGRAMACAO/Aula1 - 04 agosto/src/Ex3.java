/*
Desenvolva um programa em Java que dado o raio de um círculo (um inteiro), calcule e impri-ma seu diâmetro, área e circunferência. 
Sabe-se que
:a)Diâmetro: 2R
b)Área do círculo: pR2
c)Circunferência: 2pR
Dica: use a constante PI da classe Math, para obter o valor de p.
*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do Raio: ");
        int raio = in.nextInt();
        int diame = raio * 2;
        double area = Math.PI * (Math.pow(raio, 2));
        double circu = (2 * Math.PI) * raio;
        System.out.printf("O valor do Diâmetro é: %d\n", diame);
        System.out.printf("O valor do Diâmetro é: %.2f\n", area); // com os 2 primeiros numeros após o ponto
        System.out.printf("O valor do Diâmetro é: %.3f\n", circu); // com os 3 primeiros numeros após o ponto

        /*
         * System.out.
         * printf("O valor do Diâmetro é: +new DecimalFormat(.##).fotmat(area)) --- fazendo com criação de Objetos, no "
         * (.##") é onde foi declarado a orde, que depois do ponto haverá apenas dois
         * caracteres. System.out.printf("O valor do Diâmetro é: +new
         * DecimalFormat(.##).fotmat(circu)) ----------SENDO MAIS USADO PARA QUANDO SE
         * QUER GRAVAR EM ALGUMA VARIÁVEL---------------
         */

        /*
         * System.out.printf("O valor do Diâmetro é: "+Math.round(area)) --- para
         * arredondar exatamente System.out.printf("O valor do Diâmetro é: "+
         * Math.round(circu)) --- para arredondar exatamente
         */
    }

}
