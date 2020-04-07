package Password;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AppPassword {
    public static void main(String[] args) {

        System.out.println("ingresa el numero de contraseñas que deseas generar automaticamente");
        Scanner introTamanoListaPasswords = new Scanner(System.in);
        int cantidadPasswords = introTamanoListaPasswords.nextInt();
        Password listaPassword [];
        listaPassword = new Password[cantidadPasswords];
        List<Boolean> passwordAceptado = new ArrayList<Boolean>();

        System.out.println("ingresa la longitud de las contraseñas");
        Scanner introLongitudContrasena = new Scanner(System.in);
        int longitudContrasena = introLongitudContrasena.nextInt();

        for (int i = 0; i < listaPassword.length; i++) {
            listaPassword[i] = new Password(longitudContrasena);
            System.out.println(listaPassword[i]);
            if(listaPassword[i].esFuerte()){
                //passwordAceptado.add(listaPassword[i].esFuerte());
                System.out.println(passwordAceptado.add(listaPassword[i].esFuerte()));
            }

        }

    }
}
