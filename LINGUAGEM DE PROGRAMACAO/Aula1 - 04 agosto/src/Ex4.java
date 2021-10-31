/*
Desenvolva um programa em Java para calcular o volume de um cone dados dois números in-teiros, 
representado o raio da base do cone (r) e a sua altura (h). 
Sabe-se que o volume do coneé dado por:
V=Ab⋅h3
onde Ab é a área da base do cone.
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o Raio do cone: ");
        int raio = in.nextInt();
        System.out.println("Digite a Altura do cone: ");
        double alt = in.nextDouble();
        double volume = (raio * alt) / 3;
        System.out.printf("O volume do Cone é: %.3f", volume);
    }

}
