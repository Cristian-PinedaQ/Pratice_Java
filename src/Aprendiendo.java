import java.util.Scanner;

public class Aprendiendo {
    public static void main(String[] args) {
       /* String name ;
        int age;

        // ingreso de datos por consola
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ...");
        name = input.next();
        System.out.println("Cual es tu edad: ...");
        age = input.nextInt();

        System.out.println("Hola eres " + name + "y tienes " + age + " anos");

        // falta cerrar la clase scaner*/

        boolean a = true, b = true;
//        OPERADORES DE COMPARACION
//XOR evalua que solo una de las codiciones sea true de lo contrario es false
        System.out.println("operador XOR: "+ (a ^ b));
//AND evalua si las 2 codiciones son true y devuenve true
        System.out.println("operador and: "+ (a && b));
//OR evalua si una de las codiciones o las 2 sean true de lo contrario es false
        System.out.println("operador OR: "+ (a || b));
    }
}
