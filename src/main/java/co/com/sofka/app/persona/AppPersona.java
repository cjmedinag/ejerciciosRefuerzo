package co.com.sofka.app.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppPersona {

    public static void main(String[] args) {

        List<Persona>personas = new ArrayList<Persona>();

        System.out.println("Ingrese su nombre");
        Scanner introName = new Scanner(System.in);
        String nombre = introName.nextLine();

        System.out.println("Ingrese su edad");
        Scanner introAge = new Scanner(System.in);
        int edad = introAge.nextInt();

        System.out.println("Ingrese su sexo");
        Scanner introSex = new Scanner(System.in);
        String sexo = introSex.nextLine();

        System.out.println("Ingrese su peso");
        Scanner introWeight = new Scanner(System.in);
        float peso = introWeight.nextFloat();

        System.out.println("Ingrese su altura");
        Scanner introHeight = new Scanner(System.in);
        float altura = introHeight.nextFloat();

        Persona persona1;
        Persona persona2;
        Persona persona3;

        personas.add(persona1 = new Persona(nombre, edad, sexo, peso, altura));
        personas.add(persona2 = new Persona(nombre, edad, sexo));
        personas.add(persona3 = new Persona());


        persona3.setNombre("jose");
        persona3.setEdad(30);
        persona3.setPeso(80);
        persona3.setAltura(1.80f);
        persona3.setSexo("masculino");

        persona1.calcularImc(peso, altura);
        persona2.calcularImc(peso, altura);
        persona3.calcularImc(persona3.getPeso(), persona3.getAltura());

        for (Persona persona:personas) {
            if(persona.esMayorDeEdad(persona.getEdad())){
                System.out.println("la persona ".concat(persona.getNombre()).concat(" es mayor de edad"));
            }
        }

        System.out.println("los datos de la persona uno son: ".concat("" + persona1));
        System.out.println("los datos de la persona dos son: ".concat("" + persona2));
        System.out.println("los datos de la persona tres son: ".concat("" + persona3));

    }
}
