import java.util.Scanner;

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
public class ex0o3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        int cont = 0;
        char alfa = ' ';
        int sla = 0;

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
        for (int y = 0; y < 5; y++) {
            if (cont == 0) {
                alfa = 'A';
                sla = contA;
            }
            if (cont == 1) {
                alfa = 'E';
                sla = contE;
            }
            if (cont == 2) {
                alfa = 'I';
                sla = contI;
            }
            if (cont == 3) {
                alfa = 'O';
                sla = contO;
            }
            if (cont == 4) {
                alfa = 'U';
                sla = contU;
            }
            System.out.printf("(%s):", alfa);
            for (int x = 0; x < sla; x++) {
                System.out.print("*");
            }
            System.out.printf("(%d)\n", sla);
            cont++;
        }
    }
}
