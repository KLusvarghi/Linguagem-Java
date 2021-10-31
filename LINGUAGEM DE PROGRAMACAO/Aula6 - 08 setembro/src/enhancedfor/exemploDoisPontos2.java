package enhancedfor;

import java.util.Scanner;

public class exemploDoisPontos2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int val = in.nextInt();
        String result = val > 0 ? (val > 5) ? "Greater Than 5" : "Less Than 5" : "Negative Integer";
        System.out.println(result);
    }
}
