import java.util.Scanner;

public class exampleScaner {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Escribe el nombre de la pelicula: ");
            String pelicula = teclado.nextLine();
            System.out.print("Escribe la fecha de lanzamiento: ");
            int lanzamiento = teclado.nextInt();
            System.out.print("indique en una calificacion del 1 al 10, cuanto le agrado la pelicula: ");
            double calificacion = teclado.nextDouble();

            System.out.println(pelicula);
            System.out.println(lanzamiento);
            System.out.println(calificacion);

            teclado.close();
        }

}
