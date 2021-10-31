package vetores.exemplosvetores;

public class exEnhancedFor {
    public static void main(String[] args) {

        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        for (int x : idades) { // aqui o X irá receber cada valor de "idades" sem precisar colocar ida
            System.out.println(x); // um jeito mais facil de se exibir um. sendo chamada de enhanced-for está
                                   // funçao

        }
    }

}
