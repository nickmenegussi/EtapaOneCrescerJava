import ApetiteJogador.Conservador;
import ApetiteJogador.Indiferente;
import ApetiteJogador.Mercenario;
import Clube.Clube;
import Negociacao.Negociacao;
import jogador.Atacante;
import jogador.Goleiro;
import jogador.MeioCampo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class JogadorTest {
    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa(){
        // Arrange
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, BigDecimal.valueOf(100000000));
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, new Indiferente(), BigDecimal.valueOf(800500), 12);

        // Act
        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        // Assert
        Assert.assertTrue(foiPossivelNegociar);

    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua(){
        // Arrange
        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, BigDecimal.valueOf(100000000));
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, new Conservador(), BigDecimal.valueOf(800500), 20);

        // Act
        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        // Assert
        Assert.assertFalse(foiPossivelNegociar);

    }
    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel(){
        // Arrange


        MeioCampo meioCampista = new MeioCampo("Jean Pierre", 28, "Grêmio", 5, new Conservador(), BigDecimal.valueOf(10000000));
        Clube clube = new Clube("Juventude", 2, BigDecimal.valueOf(1000));
        Negociacao negociacao = new Negociacao();
        // Act

        boolean foiPossivel = negociacao.negociar(clube, meioCampista);

        // Assert

        Assert.assertFalse(foiPossivel);
    }
    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos(){
        // Arrange
        MeioCampo meioCampo = new MeioCampo("Iniesta", 27, "Barcela A", 4, new Mercenario(), BigDecimal.valueOf(1000000));
        BigDecimal valorEsperado = BigDecimal.valueOf(1000000); // sem desconto

        // Act
        BigDecimal valorCalculado = meioCampo.valorDeCompra();

        // Assert
        Assert.assertEquals(valorEsperado, valorCalculado);
}

        @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos(){
        // Arrange
        // Act
        // Assert
    }
}
