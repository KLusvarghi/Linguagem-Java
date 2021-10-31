public class replaceStringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("fatec PG");
        str.replace(6, 8, "Praia Grande"); // ele irá subustituir o caracter na posição 6 que é o "P" até a posição 7,
                                           // porque quando se coloca 8, ele irá 8 menos 1, ou se fosse 4, seria até a
                                           // posição 3. substituindo "pg" por Praia grande
        str.setCharAt(0, 'F'); // substitui o "f" e acrescenta o "F"
        System.out.println(str);

        // REPLACE para palavras
        // SETCHARTAT para caracteres
    }
}
