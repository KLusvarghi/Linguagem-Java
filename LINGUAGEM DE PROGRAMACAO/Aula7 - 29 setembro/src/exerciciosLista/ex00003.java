import java.util.Scanner;

public class ex00003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] cont = new int[5];
        String vogais = "aeiou";
        String str = in.nextLine();

        str = str.toLowerCase();

        for (int x = 0; x < str.length(); x++) {
            for (int j = 0; j < vogais.length(); j++) {
                if (str.charAt(x) == vogais.charAt(j)) {
                    cont[j]++;
                    break;
                }
            }
        }

        for (int i = 0; i < vogais.length(); i++) {
            System.out.print(vogais.charAt(i) + ": ");
            for (int j = 0; j < cont[i]; j++) {
                System.out.print('*');
            }
            System.out.println(" (" + cont[i] + ")");
        }
    }
}
