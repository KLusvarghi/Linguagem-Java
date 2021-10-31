
/*
Desenvolva um programa para determinar a média final e a situação (Aprovado, Reprovado
ou Exame) de um aluno em uma disciplina. São dadas as notas de três provas, o número de
aulas ministradas e o número de faltas do aluno. Sabe-se que a média final é a média
aritmética dessas três provas e que a média para aprovação é 7, menor do que 3 para
reprovação e as demais em exame. Entretanto, o aluno estará reprovado se tiver faltado a
mais do que 25% das aulas.
*/
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota das três provas: ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        System.out.println("Digite o número de aulas ministradas: ");
        int aulaMinistradas = in.nextInt();
        System.out.println("Digite a quantidade de faltas do aluno: ");
        int faltas = in.nextInt();
        float rusultFaltas = (aulaMinistradas * 0.25f) - faltas;
        double mediaAritimetica = (n1 + n2 + n3) / 3;
        if (mediaAritimetica >= 7 && rusultFaltas >= 0) {
            System.out.println("Situação: APROVADO");
        } else if (mediaAritimetica >= 3 && mediaAritimetica < 7 && rusultFaltas >= 0) {
            System.out.println("Situação: EXAME");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
