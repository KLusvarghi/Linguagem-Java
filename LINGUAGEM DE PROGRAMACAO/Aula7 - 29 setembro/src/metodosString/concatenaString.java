public class concatenaString {
    public static void main(String[] args) {
        String nome = "Ciro";
        String sobrenome = "Trindade";
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo: ".concat(nome).concat(" ").concat(sobrenome).concat(" "));
        System.out.println(String.format("%s %s %s", "Nome completo:", nome, sobrenome));
        System.out.printf("Nome completo: %s %s", nome, sobrenome); // sendo a forma mais prática de se concatenar
        System.out.println();

        // %s para string
        // %d para inteiro
        // %f para double ou float se eu não me engano
    }
}
