import java.util.Scanner;

public class tp01 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int resul = 0;
        System.out.print("Digite o número de Participantes: ");
        int numParticipantes = in.nextInt();
        System.out.print("Informe o Orçamento: ");
        int orcamento = in.nextInt();
        System.out.print("Qual a quantidade de Hoteis a conciderar: ");
        int hoteisConciderar = in.nextInt();
        System.out.print("Qual a quantidade de semanas a se escolher: ");
        int semanasEscolher = in.nextInt();
        boolean aprovado = false;
        int i = 0;
        while (i != hoteisConciderar) {
            i++;
            System.out.print("\nQual o preço por uma pessoa se Hospedar no fim de semana no hotel: ");
            int precoUmaPessoa = in.nextInt();
            int camasSemana1 = 0;
            int camasSemana2 = 0;
            int camasSemana3 = 0;
            int camasSemana4 = 0;
            if (semanasEscolher == 1) {
                System.out.print("Digite o número de camas disponiveis a cada final de semana: ");
                camasSemana1 = in.nextInt();
                System.out.println("\n");
            } else if (semanasEscolher == 2) {
                System.out.println("Digite o número de camas disponiveis a cada final de semana: ");
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
                System.out.println("\n");
            } else if (semanasEscolher == 3) {
                System.out.println("Digite o número de camas disponiveis a cada final de semana: ");
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
                camasSemana3 = in.nextInt();
                System.out.println("\n");
            } else {
                System.out.println("Digite o número de camas disponiveis a cada final de semana: ");
                camasSemana1 = in.nextInt();
                camasSemana2 = in.nextInt();
                camasSemana3 = in.nextInt();
                camasSemana4 = in.nextInt();
                System.out.println("\n");
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
        if (aprovado == true && resul <= orcamento) {
            System.out.println(resul);
        } else {
            System.out.println("Fique em casa!");
        }
    }
}