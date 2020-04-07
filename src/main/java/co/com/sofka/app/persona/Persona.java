package co.com.sofka.app.persona;

import java.util.Scanner;

import static co.com.sofka.app.persona.Sexo.FEMENINO;
import static co.com.sofka.app.persona.Sexo.MASCULINO;

public class Persona {
    private String nombre;
    private float peso;
    private float altura;
    private String documento;
    private String sexo;
    private int edad;

    public Persona(String nombre, int edad, String sexo, float peso, float altura){
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.documento = generarDocumento();
        this.sexo = String.valueOf(comprobarSexo(sexo));
    }

    public Persona(){
        this.peso = 0f;
        this.altura = 0f;
        this.sexo = String.valueOf(MASCULINO);
        this.nombre = "";
        this.edad = 0;
        this.documento = generarDocumento();
    }

    public Persona(String nombre, int edad, String sexo){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = String.valueOf(comprobarSexo(sexo));
    }

    public int calcularImc(float peso, float altura){
        final int PESO_IDEAL = -1;
        final int PESO_BAJO = 0;
        final int PESO_ALTO = 1;
        final int PESO_NO_IGREADO = 0;

        try {
            float imc = (float) (peso/Math.pow(altura, 2));
            if(imc < 20){
                System.out.println(this.nombre.concat(" tiene peso ideal"));
                return PESO_IDEAL;
            } else if (imc >= 20 && imc <= 25){
                System.out.println(this.nombre.concat(" tiene bajo peso"));
                return PESO_BAJO;
            } else {
                System.out.println(this.nombre.concat(" tiene sobrepeso"));
                return PESO_ALTO;
            }
        } catch (ArithmeticException excepcion){
            System.out.println("No es posible calcular el IMC verifica que los valores para el peso y la altura son mayores a cero ");

            return calcularImc(this.peso = 1, this.altura = 1);
        }
    }

    public boolean esMayorDeEdad(int edad){
        if(edad < 18){
            return false;
        } else {
            return true;
        }
    }

    public Sexo comprobarSexo(String sexo){

        if(sexo.toUpperCase().equals(String.valueOf(MASCULINO)) || sexo.toUpperCase().equals(String.valueOf(FEMENINO))){
            this.sexo =sexo.toUpperCase();
        } else {
            this.sexo = String.valueOf(MASCULINO);
        }
        return Sexo.valueOf(this.sexo.toUpperCase());
    }

    private char generarLetraDNI(int numberDNI){
        final char [] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letters[numberDNI % 23];
    }

    private String generarDocumento(){
        String generateDni = String.valueOf(generarNumeroDNI()).concat(String.valueOf(generarLetraDNI(generarNumeroDNI())));
        return generateDni;
    }

    private int generarNumeroDNI(){
        final int MAXIMO = 99999999;
        final int MINIMUM = 00000000;
        int numberDNI = (int) (Math.random()*MAXIMO+MINIMUM);
        return numberDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = String.valueOf(comprobarSexo(sexo));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", documento='" + documento + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                '}';
    }
}
