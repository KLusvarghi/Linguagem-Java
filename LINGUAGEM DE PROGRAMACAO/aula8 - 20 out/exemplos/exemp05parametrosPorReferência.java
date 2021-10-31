public class exemp05parametrosPorReferência {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.printf("a = %d\tb= %d\n", a, b);
        trocar(a, b);
        System.out.printf("a = %d\tb= %d\n", a, b);
    }

    public static void trocar(int a, int b) {
        int aux = a;
        a = b;
        b = aux;
        System.out.printf("a = %d\tb= %d\n", a, b);

    }
}
