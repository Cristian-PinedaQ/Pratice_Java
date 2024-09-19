import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {
        String cliente = "Tony stark";
        String tipoCuenta = "Corriente";
        Double credito = 1599.99;
        double cash = 0;
        int opcion = 0;


        Scanner input = new Scanner(System.in);

        String header = String.format("""
                ********************************************
                Datos del cliente
                nombre : %s
                Tipo de cuenta : %s
                Saldo disponible: %.2f
                ********************************************
                """, cliente, tipoCuenta, credito);
        System.out.println(header);
        while (opcion != 9){
            System.out.println("""
                    ** Escriba el numero de la opcion deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
         opcion = input.nextInt();
         switch (opcion){
             case 1:
                 System.out.println("El saldo actual de su cuenta " + tipoCuenta + " es $" + credito + "\n");
                 break;
             case 2:
                 System.out.println("¿Cuanto desea Retirar?");
                 cash = input.nextDouble();
                 if (cash < credito){
                     credito -= cash;
                     System.out.println("Has Retirado $" + cash + " su nuevo saldo es $" + credito + "\n");
                     break;
                 }else {
                     System.out.println("Saldo insuficiente");
                     break;
                 }
             case 3:
                 System.out.println("¿Cuanto desea Depositar?");
                 cash = input.nextDouble();
                 credito += cash;
                 System.out.println("Has Depositado $" + cash + " su nuevo saldo es $" + credito + "\n");
                 break;
             case 9:
                 System.out.println("Vuelva pronto");
                 break;
             default:
                 System.out.println("Opcion no valida, intente de nuevo por favor." + "\n");
         }

        }
        System.out.println("credito actualizado $" + credito);
    }
}
