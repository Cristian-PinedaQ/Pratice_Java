public class Casting {
    public static void main(String[] args) {
    // CONVERCION DE VALORES DE VARIABLES O CASTING

    //CONVERSION DE STRING A ENTERO
    String textoNum = "123";
    int numero = Integer.parseInt(textoNum);
        System.out.println("valor string convertido: "+ numero);

    //CONVERSION DE ENTERO A STRING
    numero = 456;
    textoNum = String.valueOf(numero);
        System.out.println("valor numero convertido: "+ textoNum);

    //DE DOBLE A ENTERO
    double numDecimal = 12.45;
    numero = (int)numDecimal;
    System.out.println("valor decimal convertido: "+numero);

    //DE DOBLE A ENTERO
    numero = 43;
    numDecimal = (double) numero;
    System.out.println("valor decimal convertido: "+numDecimal);
    }




}
