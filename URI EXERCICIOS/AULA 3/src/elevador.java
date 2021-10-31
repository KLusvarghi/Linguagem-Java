import java.util.Scanner;

public class elevador {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int quant, quantMaxPessoas, sairam = 0, entraram = 0, tot = 0;
        boolean excessoPessoas = false;
        System.out.println("Digite a quantidade de vezes que esse processo irá se realizar: ");
        quant = in.nextInt();
        System.out.println("Digite a quantidade máxima de pessoas: ");
        quantMaxPessoas = in.nextInt();

        for (int i = 1; i <= quant; i++) {
            sairam = in.nextInt();
            entraram = in.nextInt();

            tot = (tot - sairam) + entraram;

            if (tot > quantMaxPessoas) {
                excessoPessoas = true;
            }
        }
        if (excessoPessoas == true) {
            System.out.println("S");
        } else {
            System.out.println("S");
        }
    }
}
