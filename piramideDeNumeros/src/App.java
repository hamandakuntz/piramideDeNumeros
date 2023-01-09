public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int j;
        int[] numeros = { 1, 2, 3, 4, 5 };

        for (i = 0; i < numeros.length; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(numeros[i]);
            }
            System.out.println();
        }
    }
}
