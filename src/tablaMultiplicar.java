import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println(" ingrese el multiplo a multiplcar");
        int valor2;
        valor2 = entrada.nextInt();

        int i = 0;

        while (i < 10) {
            i++;
            int res = valor2 * i;
            System.out.println(i + " X " + valor2 + " = " + res);
        }
    }
}
