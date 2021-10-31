public class parmetroPorReferencia {
    public static void main(String[] args) {
        StringBuffer val = new StringBuffer("Fatec");
        System.out.println(val);
        mudarValor(val);
        System.out.println(val);
    }

    public static void mudarValor(StringBuffer val) {
        val.append(" PG");
    }
}
