import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        // Arrange
        double valor1 = 4;
        double valor2 = 4;
        double resultadoEsperado = 8;
        Calculadora calculadora = new Calculadora();

        // Act
        double valorCalculado = calculadora.soma(valor1, valor2);

        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros(){
        // Arrange
        double valor1 = 10;
        double valor2 = 5;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        // Act
        double valorCalculado = calculadora.subtracao(valor1, valor2);

        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }


    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        double valor1 = 5;
        double valor2 = 5;
        double resultadoEsperado = 1;
        Calculadora calculadora = new Calculadora();

        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);

        // Assert

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.001);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        double valor1 = 5;
        double valor2 = 5;
        double resultadoEsperado = 25;
        Calculadora calculadora = new Calculadora();

        // Act
        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        // Assert

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.001);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        // Arrange
        double valor1 = 10.5;
        double valor2 = 5.5;
        double resultadoEsperado = 1.90;
        Calculadora calculadora = new Calculadora();

        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);

        // Assert

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

}
