package co.com.sofka.app.persona;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonaTest {
    Persona persona;
    Persona persona1;

    @BeforeAll
    public void configuracion(){
        persona = new Persona();
        persona1 = new Persona("Cristian", 28, "MASCULINO",65F, 1.65F);
    }

    @Test
    @DisplayName("validando que se calcula el IMC bien persona creada desde constructor con todos los parametros")
    public void calcularImcConDatosDePersonaCreadaDesdeConstructor(){
        //Arrange --> inicializacion de variables para prueba
        int imcEsperado = 0;

        //act --> ejecutar metodos para comprobar la respuesta
        int respuesta = persona1.calcularImc();

        //Assert
        Assertions.assertEquals(imcEsperado, respuesta);

    }

    @Test
    @DisplayName("validando que se calcula el IMC persona creada con constructor vacio")
    public void calcularImcConDatosDePersonaCreadaDesdeConstructorVacio(){
        //Arrange --> inicializacion de variables para prueba
        int imcEsperado = 2;

        //act --> ejecutar metodos para comprobar la respuesta
        int respuesta = persona.calcularImc();

        //Assert
        Assertions.assertEquals(imcEsperado, respuesta);

    }

    @Test
    @DisplayName("validando que se calcula el IMC persona creada con constructor vacio")
    public void calcularImcConDatosDePersonaCreadaDesdeConstructorVacioValoresIngresadosPorSet(){
        //Arrange --> inicializacion de variables para prueba
        persona.setPeso(65F);
        persona.setAltura(1.65F);
        int imcEsperado = (int) (persona.getPeso()/Math.pow(persona.getAltura(), 2));
        //act --> ejecutar metodos para comprobar la respuesta
        int indiceImcEsperado = 0;
        int respuesta = persona.calcularImc();

        //Assert
        Assertions.assertEquals(indiceImcEsperado, respuesta);

    }

    @Test
    @DisplayName("validando que se calcula el IMC persona creada con constructor vacio")
    public void verificarSiEsMayorDeEdadConstructorVacio(){
        //Arrange --> inicializacion de variables para prueba
        persona.setEdad(23);

        //act --> ejecutar metodos para comprobar la respuesta
        boolean esMayorDeEdadEsperado = true;
        boolean respuesta = persona.esMayorDeEdad(persona.getEdad());

        //Assert
        Assertions.assertEquals(esMayorDeEdadEsperado, respuesta);
    }

    @Test
    @DisplayName("validando que se calcula el IMC persona creada con constructor vacio")
    public void verificarSiEsMayorDeEdadConstructorConParametros(){
        //Arrange --> inicializacion de variables para prueba

        //act --> ejecutar metodos para comprobar la respuesta
        boolean esMayorDeEdadEsperado = true;
        boolean respuesta = persona1.esMayorDeEdad(persona1.getEdad());

        //Assert
        Assertions.assertEquals(esMayorDeEdadEsperado, respuesta);
    }

    @Test
    @DisplayName("comprobando sexo con constructor vacio")
    public void comprobarSexoConstructorVacio(){
        //Arrange --> inicializacion de variables para prueba

        //act --> ejecutar metodos para comprobar la respuesta
        String sexoEsperado = "MASCULINO";
        String respuesta = persona.getSexo();

        //Assert
        Assertions.assertEquals(sexoEsperado, respuesta);
    }

    @Test
    @DisplayName("comprobar que introduciendo un palabra distina a masculino o femenino retorna masculino")
    public void comprobarSexoConstructorVacioConfigurandoParametros(){
        //Arrange --> inicializacion de variables para prueba
        persona.setSexo("kdkdkdkdk");
        //act --> ejecutar metodos para comprobar la respuesta
        String sexoEsperado = "MASCULINO";
        String respuesta = persona.getSexo();

        //Assert
        Assertions.assertEquals(sexoEsperado, respuesta);
    }

    @Test
    @DisplayName("comprobar que introduciendo un palabra distina a masculino o femenino retorna masculino")
    public void comprobarSexoConstructorConParametros(){
        //Arrange --> inicializacion de variables para prueba
        String sexoIngresadoConstructor = persona1.getSexo();
        //act --> ejecutar metodos para comprobar la respuesta
        String sexoEsperado = "MASCULINO";
        String respuesta = persona1.getSexo();

        //Assert
        Assertions.assertEquals(sexoEsperado, respuesta);
    }

    @Test
    @DisplayName("comprobar que introduciendo un palabra distina a masculino o femenino retorna masculino")
    public void comprobarSexoConstructorVacioSexoFemenino(){
        //Arrange --> inicializacion de variables para prueba
        persona.setSexo("femenino");
        String sexoIngresadoConstructor = persona.getSexo();
        //act --> ejecutar metodos para comprobar la respuesta
        String sexoEsperado = "FEMENINO";
        String respuesta = persona.getSexo();
        //Assert
        Assertions.assertEquals(sexoEsperado, respuesta);
    }



}
