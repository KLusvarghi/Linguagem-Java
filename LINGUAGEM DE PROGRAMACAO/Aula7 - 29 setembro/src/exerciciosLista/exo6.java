import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1581
public class exo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean verifica = true;
        int a = 0;
        int talvez = 0;
        int vezes = 0;

        System.out.print("Digite a quantidade de grupos: ");
        int quantGrupo = in.nextInt();
        String[] idioma = new String[quantGrupo];

        for (int x = 0; x < quantGrupo; x++) {
            System.out.print("\nDigite a quantidade de pessoas no grupos: ");
            int quantPessoas = in.nextInt();
            String[] nacionalidade = new String[quantPessoas];
            int[] igual = new int[quantPessoas];

            System.out.println("\nDigite a nacionalidade de cada um do grupo: ");
            for (int y = 0; y < quantPessoas; y++) {
                nacionalidade[y] = in.next();
            }
            for (int z = 0; z < quantPessoas; z++) {
                a = 0;
                igual[z] = nacionalidade[a].compareToIgnoreCase(nacionalidade[z]);
            }
            for (int z = 0; z < quantPessoas; z++) {
                if (igual[z] != 0) {
                    talvez++;
                }
            }
            if (talvez == 0) {
                verifica = true;
                idioma[vezes] = nacionalidade[a];
            } else {
                verifica = false;
                idioma[vezes] = "Inglês";
            }
            vezes++;
            talvez = 0;
        }
        System.out.println();
        for (int p = 0; p < quantGrupo; p++) {
            if (verifica == true) {
                System.out.println(idioma[p]);
            } else {
                System.out.println(idioma[p]);
            }
        }
    }
}
