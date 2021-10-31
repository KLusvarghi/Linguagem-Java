import java.util.Scanner;

public class exemp01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe as notas de 2 provas: ");
        float p1 = in.nextFloat(), p2 = in.nextFloat();
        float media = calcularMedia(p1, p2);
        System.out.printf("Media: %.2f\n", media);
        in.close();
    }

    private static float calcularMedia(float p1, float p2) {
        float media = (p1 + p2) / 2;
        return media;

    }
}
