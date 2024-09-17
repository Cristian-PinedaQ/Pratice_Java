public class text_block_templateString {
    public static void main(String[] args) {
        String nombre = "juan";
        int clases = 4;
//Para referenciar variables en una String es necesario usar .formatted(variable/s) con %letra
 // %s = String -- %d = enteros ---
        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d clases para mostrarte lo que es necesario,
                  para que puedas dar tu primeros pasos en este lenguaje
                  """.formatted(nombre, clases);

        System.out.println(mensaje);
    }
}
