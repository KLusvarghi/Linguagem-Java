public class IndexOfocorrenciaString {
    public static void main(String[] args) {
        String str = "FatecPraiaGrande";
        System.out.println(str.indexOf(" ")); // indexOf irá devolver a posição do caracteres quando acontecer o
                                               // primeiro ato de "ra" que esta mo exemplo
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("ra", 10));// indexOf irá devolver a posição do caracteres quando acontecer o
                                                  // primeiro ato de "ra" apartir da posição ***10*** que esta mo
                                                  // exemplo
        System.out.println(str.indexOf('a', 10));
        System.out.println(str.lastIndexOf("ra")); // ele irá devolver a posição do primeiro caracter que é (13) na
                                                   // ultima vez que ocorrer o "ra"
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.startsWith("Fatec")); // devolver em boolean se ele começar com a os caracteres que estão
                                                     // dentro do parenteses
        System.out.println(str.endsWith("Grande"));// devolver em boolean se ele finaliza com a os caracteres que estão
                                                   // dentro do parenteses
        System.out.println(str.startsWith("Fatec", 5));// devolver em boolean se ele começa com a os caracteres que
                                                       // estão dentro do parenteses APARTIR da pocição 5
    }
}
