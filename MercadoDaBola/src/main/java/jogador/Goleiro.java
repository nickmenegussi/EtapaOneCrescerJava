package jogador;

import ApetiteJogador.ApetiteJogador;

import java.math.BigDecimal;

public class Goleiro extends Jogador {
    protected static int penaltisDefendidosNoAno;

    public Goleiro(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetite, BigDecimal precoDeMercado, int penaltisDefendidosNoAno) {
        super(nomeJogador, idadeJogador, clubeAtual, reputacaoHistorica, apetite, precoDeMercado);
        this.penaltisDefendidosNoAno = penaltisDefendidosNoAno;
    }


    @Override
    public BigDecimal valorDeCompra() {
        BigDecimal valorBase = super.valorDeCompra(); // já inclui o apetite

        // 4% por pênalti defendido
        BigDecimal percentual = BigDecimal.valueOf(0.04).multiply(BigDecimal.valueOf(penaltisDefendidosNoAno));
        BigDecimal acrescimo = valorBase.multiply(percentual);

        return valorBase.add(acrescimo);
    }
}
