package co.com.sofka.app.operacionesmatematicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    @Test
    public void metodoSumaDeveriaRetornar5CuandoParametrosSean3Y2(){
        //arrange -> definir variables
        //variables que voy a mandar
        Integer numeroUno = 3;
        Integer numeroDos = 2;
        Integer esperado = 5;
        //Variables que espero recibir

        //act -> llamar el metodo que vamos a probar
        Integer resultado = OperacionesMatematicas.suma(numeroUno, numeroDos);

        //act -> comprobacion de resultados
        assertEquals(esperado, resultado);
    }

    @Test
    public void metodoSumaDeveriaRetornar5CuandoParametrosSean4y3(){
        //arrange -> definir variables
        //variables que voy a mandar
        Integer numeroUno = 4;
        Integer numeroDos = 3;
        Integer esperado = 7;
        //Variables que espero recibir

        //act -> llamar el metodo que vamos a probar
        Integer resultado = OperacionesMatematicas.suma(numeroUno, numeroDos);

        //act -> comprobacion de resultados
        assertEquals(esperado, resultado);
    }

    @Test
    public void metodorestadeberiaretornar4cuandolosparametrossean10y6(){
        //arrange //definicion de las variables iniciales
        //variables que voy a mandar
        Integer numeroUno = 10;
        Integer numeroDos = 6;
        Integer esperado = 4;

        //act -> llamar al metodo que se va a probar
        Integer resultado = OperacionesMatematicas.resta(numeroUno, numeroDos);

        //assert
        assertEquals(esperado, resultado);

    }

    @Test
    public void metodorestardosnumerosdeberiretornar5delarestade10y5(){
        Integer numeroUno = 10;
        Integer numeroDos = 5;
        Integer esperado = 5;
        Integer resultado = OperacionesMatematicas.resta(numeroUno, numeroDos);
        assertEquals(esperado, resultado);
    }

    @Test
    public void metodomultiplicardonumerosdeberiaretornar100delamultiplicacion10y10(){
        Integer numeroUno = 10;
        Integer numeroDos = 10;
        Integer esperado = 100;
        Integer resultado = OperacionesMatematicas.multiplicacion(numeroUno, numeroDos);
        assertEquals(esperado, resultado);
    }

    @Test
    public void metododivirdosnumerosdeberetornar2deladivision8y4() {
        Double numeroUno = 8.0;
        Double numeroDos = 4.0;
        Double esperado = 2.0;
        Double resultado = OperacionesMatematicas.dividir(numeroUno, numeroDos);
        assertEquals(esperado, resultado);
    }

    @Test
    public void metododividirentrecero(){
        Integer numeroUno = 10;
        Integer numeroDos = 0;
        Integer esperado = 10;
        assertThrows(OperacionesMatematicasException.class, ()->
                OperacionesMatematicas.dividirEnteros(numeroUno, numeroDos));
    }
}