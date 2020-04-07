package co.com.sofka.app.cuenta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CuentaTest {

    Cuenta cuenta;

    @BeforeAll
    public void configuracion(){
        cuenta = new Cuenta("Juan");
    }

    @Test
    @DisplayName("validado el ingreso de un valor 0 a una cuenta con 0 valores")
    public void ingresarDinero(){
        //Arrange (inicializacion de objetos y a asignacion de variables
        double dineroIngresado = 0;
        double resultadoEsperado = 0;

        //Act
        double resultado = cuenta.ingresarDineroCuenta(dineroIngresado);

        //Assert
        assertEquals(resultadoEsperado, resultado);

    }
    @Test
    @DisplayName("validando el ingreso de un valor negativo")
    public void ingresoDinero(){
        //Arrange
        double dineroIngresado = -1;
        double dienroEsperado = 0;

        //Act
        double resultado = cuenta.ingresarDineroCuenta(dineroIngresado);

        //Assert
        assertEquals(dienroEsperado, resultado);

    }

    @Test
    @DisplayName("validadndo retiro de dinero")
    public void retirarDinerCuenta(){
        //Arrange (inicializacion de objetos y a asignacion de variables
        double dineroRetirado = 10;
        double resultadoEsperado = 0;

        //Act
        double resultado = cuenta.retirarDineroCuenta(dineroRetirado);

        //Assert
        assertEquals(resultadoEsperado, resultado);
    }



}
