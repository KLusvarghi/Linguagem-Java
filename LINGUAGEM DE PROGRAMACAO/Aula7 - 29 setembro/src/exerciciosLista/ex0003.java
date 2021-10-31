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
public class ex0003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        String vogais[] = { "", "", "", "", "" };
        System.out.print("Informe uma string: ");
        str = in.nextLine();

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.toLowerCase().charAt(i) == 'a') {
                vogais[0] += "*";
                contA++;
            }
            if (str.toLowerCase().charAt(i) == 'e') {
                vogais[1] += "*";
                contE++;
            }
            if (str.toLowerCase().charAt(i) == 'i') {
                vogais[2] += "*";
                contI++;
            }
            if (str.toLowerCase().charAt(i) == 'o') {
                vogais[3] += "*";
                contO++;
            }
            if (str.toLowerCase().charAt(i) == 'u') {
                vogais[4] += "*";
                contU++;
            }
        }
        System.out.printf("a:%s(%d)\n", vogais[0], contA);
        System.out.printf("e:%s(%d)\n", vogais[1], contE);
        System.out.printf("i:%s(%d)\n", vogais[2], contI);
        System.out.printf("o:%s(%d)\n", vogais[3], contO);
        System.out.printf("u:%s(%d)\n", vogais[4], contU);
    }
}
