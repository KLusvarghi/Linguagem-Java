import java.util.Scanner;

public class ex03 {
    // Escreva um programa que receba uma linha de texto, conte as vogais e
    // apresente ohistograma da frequência de cada uma delas. Considere que a linha
    // de texto não contémacentuação.
    // Por exemplo:Linha de texto: “Os ultimos Jogos Olimpicos foram no Japao”
    // Histograma:
    // a: *** (3)
    // e: (0)
    // i: *** (3)
    // o: *********(9)
    // u: * (1)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        System.out.print("Digite alguma frase: ");
        String frase = in.nextLine();
        frase = frase.toUpperCase();
        System.out.println();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A') {
                contA++;
            } else if (frase.charAt(i) == 'E') {
                contE++;
            } else if (frase.charAt(i) == 'I') {
                contI++;
            } else if (frase.charAt(i) == 'O') {
                contO++;
            } else if (frase.charAt(i) == 'U') {
                contU++;
            }
        }
        System.out.print("(A):");
        for (int x = 0; x < contA; x++) {
            System.out.print("*");
        }
        System.out.printf("(%d)\n", contA);
        System.out.print("(E):");
        for (int x = 0; x < contE; x++) {
            System.out.print("*");
        }
        System.out.printf("(%d)\n", contE);
        System.out.print("(I):");
        for (int x = 0; x < contI; x++) {
            System.out.print("*");
        }
        System.out.printf("(%d)\n", contI);
        System.out.print("(O):");
        for (int x = 0; x < contO; x++) {
            System.out.print("*");
        }
        System.out.printf("(%d)\n", contO);
        System.out.print("(U):");
        for (int x = 0; x < contU; x++) {
            System.out.print("*");
        }
        System.out.printf("(%d)\n", contU);
    }
}
