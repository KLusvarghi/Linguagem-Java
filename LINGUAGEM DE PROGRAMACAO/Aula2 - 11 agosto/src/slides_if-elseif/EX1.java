import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = in.next();
        System.out.print("Digite a 1º nota: ");
        double nota1 = in.nextDouble();
        System.out.print("Digite a 2º nota: ");
        double nota2 = in.nextDouble();
        double mediaAritimetica = (nota1 + nota2) / 2;
        System.out.println("ALUNO: " + nome);
        if (mediaAritimetica >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.print("REPROVADO");
        }
    }
}
