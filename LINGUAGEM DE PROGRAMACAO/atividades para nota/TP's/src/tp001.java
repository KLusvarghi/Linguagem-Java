import java.util.Scanner;

public class tp001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resul = 0;
        int numParticipantes = in.nextInt();
        int orcamento = in.nextInt();
        int hoteisConciderar = in.nextInt();
        int semanasEscolher = in.nextInt();
        boolean aprovado = false;
        int i = 0;
        while (i != hoteisConciderar) {
            i++;
            int precoUmaPessoa = in.nextInt();
            int camasSemana1 = 0;
            int camasSemana2 = 0;
            int camasSemana3 = 0;
            int camasSemana4 = 0;
            if (semanasEscolher == 1) {
                camasSemana1 = in.nextInt();
            } else if (semanasEscolher == 2) {
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
            } else if (semanasEscolher == 3) {
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
                camasSemana3 = in.nextInt();
            } else {
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
                camasSemana3 = in.nextInt();
                camasSemana4 = in.nextInt();
            }
            if (camasSemana1 >= numParticipantes) {
                aprovado = true;
                resul = numParticipantes * precoUmaPessoa;
            } else if (camasSemana2 >= numParticipantes) {
                aprovado = true;
                resul = numParticipantes * precoUmaPessoa;
            } else if (camasSemana3 >= numParticipantes) {
                aprovado = true;
                resul = numParticipantes * precoUmaPessoa;
            } else if (camasSemana4 >= numParticipantes) {
                aprovado = true;
                resul = numParticipantes * precoUmaPessoa;
            }
        }
        System.out.println("\n");
        if (aprovado == true && resul <= orcamento) {
            System.out.println(resul);
        } else {
            System.out.println("Fique em casa!");
        }
    }
}
