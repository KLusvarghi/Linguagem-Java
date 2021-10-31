
/*
 Segundo uma tabela médica, o peso ideal está relacionado com a altura e o sexo. Fazer um
programa que receba a altura em metros e o sexo de uma pessoa, calcule e imprima o seu
peso ideal, utilizando as seguintes fórmulas:
• Para homens: (72.7 * altura) – 58
• Para mulheres: (62.1 * altura) – 44.7
*/
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu sexo: ");
        String sexo = in.nextLine();
        sexo = sexo.toLowerCase();
        System.out.print("Digite o sua altura em metros: ");
        float altura = in.nextFloat();
        float pesoIdeal;
        if (sexo == "masculino") {
            pesoIdeal = (72.7f * altura) - 58f;
            System.out.println("O peso ideal para ele é " + pesoIdeal);
        } else {
            pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("O peso ideal para ela é " + pesoIdeal);
        }

    }
}
