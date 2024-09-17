public class ExerciseGrados {
    public static void main(String[] args) {

        float celsius = 12;
        float fahrenheit = (float) ((celsius *1.8) + 32);
        int temperaturaEntera = (int) fahrenheit;

        String mensaje = String.format("%.1f grados Celsius, equivalen a %.1f grados Fahrenheit.", celsius, fahrenheit);
        System.out.println(mensaje);
        System.out.println(fahrenheit + " °F");
        System.out.println(temperaturaEntera + " °F");
    }
}
