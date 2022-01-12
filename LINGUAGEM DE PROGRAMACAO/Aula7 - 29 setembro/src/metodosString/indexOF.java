public class indexOF {
    public static void main(String[] args) {
        String x = "@646646&";
        int indexArroba = x.indexOf("@");
        int indexEComercial = x.indexOf("&");
        String resultado = x.substring(indexArroba + 1, indexEComercial);
        System.out.println(resultado);
    }
}
