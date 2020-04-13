package co.com.sofka.app.cuenta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

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
    @DisplayName("validando el ingreso de un valor negativo con saldo cero en cuenta")
    public void ingresoDinero(){

        double dineroIngresado = -1;
        double resultadoEsperado = cuenta.getCantidad();

        //Act
        double resultado = cuenta.ingresarDineroCuenta(dineroIngresado);

        //Assert
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    @DisplayName("validando el ingreso de un valor a una cuenta con saldo en cuenta")
    public void ingresoDineroCuentaConDinero() {
        //Arrange
        cuenta.setCantidad(100);
        double dineroIngresado = 100;
        double dienroEsperado = 200;

        //Act
        double resultado = cuenta.ingresarDineroCuenta(dineroIngresado);

        //Assert
        assertEquals(dienroEsperado, resultado);
    }

    @Test
    @DisplayName("validadndo retiro de dinero con saldo en cuenta")
    public void retirarDinerCuenta(){
        //Arrange (inicializacion de objetos y a asignacion de variables
        cuenta.setCantidad(200);
        double dineroRetirado = 10;
        double resultadoEsperado = 190;

        //Act
        double resultado = cuenta.retirarDineroCuenta(dineroRetirado);

        //Assert
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("validadndo retiro de dinero sin saldo en cuenta")
    public void retirarDinerCuentaSinDinero(){
        //Arrange (inicializacion de objetos y a asignacion de variables
        double dineroRetirado = 10;
        double resultadoEsperado = 0;

        //Act
        double resultado = cuenta.retirarDineroCuenta(dineroRetirado);

        //Assert
        assertEquals(resultadoEsperado, resultado);
    }

}
