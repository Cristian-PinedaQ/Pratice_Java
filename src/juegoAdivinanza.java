import java.util.Random;
import java.util.Scanner;

public class juegoAdivinanza {
    public static void main(String[] args) {

        int numSecreto = new Random().nextInt(100);
        System.out.println("""
                Bienvenido, estas listo para jugar?
                debes adivinar en 5 intentos
                empecemos
                """);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero del 1 al 100: ");
            int intento = input.nextInt();
            if (numSecreto == intento){
                System.out.println("felicidades has ganado el numero es: " + numSecreto);
                break;
            } else if (numSecreto > intento) {
                System.out.println("el numero secreto es mayor");
            } else if (numSecreto < intento) {
                System.out.println("el numero secreto es menor");
            } else if (i == 5) {
                System.out.println("sen han terminado tus intentos");
            }

        }

        input.close();

    }
}
/*
Crea un programa que simule un juego de adivinanzas.
El programa debe generar un número aleatorio entre 0 y 100,
y pedir al usuario que intente adivinar ese número en un máximo
 de 5 intentos. En cada intento, el programa debe informar si el
 número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!
 */