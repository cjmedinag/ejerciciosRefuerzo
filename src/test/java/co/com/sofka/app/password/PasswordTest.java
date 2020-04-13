package co.com.sofka.app.password;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PasswordTest {
    Password password;
    Password password2;

    @BeforeAll
    public void configuracion(){
        password = new Password();
        password2 = new Password(9);
    }

    @Test
    @DisplayName("Probando que la longitud de la contraseña que se ingresa por constructor")
    public void comprobarLongituContraseñaConstructorVacio(){
        //Arrange
        int longitudContrasenaEsperada = 8;
        //Act
        int resultado = password.getLongitudContrasena();
        //assert
        assertEquals(longitudContrasenaEsperada, resultado);
    }

    @Test
    @DisplayName("Probando que la longitud de la contraseña tenga la longitud por defecto")
    public void comprobarLongituContraseñaConstructorConParametro(){
        //Arrange
        int longitudContrasenaEsperada = 9;
        //Act
        int resultado = password2.getLongitudContrasena();
        //assert
        assertEquals(longitudContrasenaEsperada, resultado);
    }

    @Test
    @DisplayName("Probando cambiar la longitud por defecto del constructor vacio")
    public void comprobarCambiarLongitudContrasenaPorDefecto(){
        //Arrange
        password.setLongitudContrasena(10);
        int longitudContrasenaEsperada = 10;
        //Act
        int resultado = password.getLongitudContrasena();
        //assert
        assertEquals(longitudContrasenaEsperada, resultado);
    }

}
