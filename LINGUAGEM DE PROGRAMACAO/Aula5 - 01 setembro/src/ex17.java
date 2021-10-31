
// Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Escreva
// um programa em Java que dada a massa inicial, em gramas, de um material radioativo,
// determine o tempo necessário para que essa massa se torne menor do que 0,5 grama. O tempo
// deve ser calculado em horas minutos e segundos.
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a massa: ");
        float massa = in.nextFloat();
        float tempo = 0;
        do {
            massa /= 2;
            tempo += 0.50;
        } while (massa > 0.5);
        if (tempo < 0.59) {
            System.out.println("O tempo para que a massa se tornasce menor que 0,50 foi de 00.0" + tempo);
        } else if (tempo > 0.99 && tempo < 59.59) {
            System.out.println("O tempo para que a massa se tornasce menor que 0,50 foi de 00.0" + tempo + "0");
        } else {
            System.out.println("O tempo para que a massa se tornasce menor que 0,50 foi de" + tempo);
        }
    }
}
