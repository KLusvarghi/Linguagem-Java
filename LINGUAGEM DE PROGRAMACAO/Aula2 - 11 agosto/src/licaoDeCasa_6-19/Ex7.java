
//. Desenvolva um programa que dados dois números inteiros, imprimi-los em ordem decrescente
// (suponha números diferentes).
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        System.out.println("");
        if (n1 > n2) {
            System.out.println("<" + n1 + ">" + "\n" + "<" + n2 + ">");
        } else if (n2 > n1) {
            System.out.println("<" + n2 + ">" + "\n" + "<" + n1 + ">");
        } else {
            System.out.println("Ambos os números são identicos. [" + n1 + "] -- [" + n2 + "]");
        }
    }
}
