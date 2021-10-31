import java.util.Scanner;

public class estruturaFOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite qual tabuada deseja saber: ");
        int tabu = in.nextInt();
        System.out.print("Até qual numero deseja saber: ");
        int tabuNumero = in.nextInt();
        int vezes = 0;
        for (int i = 0; i <= tabuNumero; i++) {
            vezes = tabu * i;
            System.out.println(tabu + " X " + i + " = " + vezes);
        }
    }
}
