import java.util.Scanner;

public class ex003 {
    // Escreva um programa em Java contendo um método que receba como parâmetros as
    // três notas de um aluno e uma letra. Se a letra for ‘A’, o método deverá
    // calcular a média aritmética das notas do aluno; se for ‘P’, deverá calcular a
    // média ponderada, com os pesos 5, 3 e 2, respectivamente. A média calculada
    // deverá ser devolvida ao programa principal para, então, ser mostrada.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno: ");
        float n1 = in.nextFloat(), n2 = in.nextFloat(), n3 = in.nextFloat();
        System.out.println("Insira um método de cálculo da média");
        System.out.println("Ponderada(p); Aritimética(a)");
        String letra = in.next();
        System.out.printf("A média do aluno(a) é %.2f \n", calculoMedia(n1, n2, n3, letra.charAt(0)));
    }

    public static float calculoMedia(float n1, float n2, float n3, char letra) {
        float media = 0;
        if (Character.toUpperCase(letra) == 'A') {
            media = (n1 + n2 + n3) / 3;
        }else {
            media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
            // media = Math.round(media);
        }
        return media;
    }
}
