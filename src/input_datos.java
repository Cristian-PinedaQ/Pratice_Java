import javax.swing.*;

public class input_datos {
    public static void main(String[] args) {
        String name;
        int age;

        // ingreso datos por ventana
        name = JOptionPane.showInputDialog(null, "Ingrese su nombre: ...");

        String age2 = JOptionPane.showInputDialog(null, "Ingrese su edad: ...");
        age = Integer.parseInt(age2);
        //muestra mensaje en cuadro de dialogo
        JOptionPane.showMessageDialog(null, "Nombre: "+name+ "\n"+
                                                                    "Edad: "+ age);

    }
}
