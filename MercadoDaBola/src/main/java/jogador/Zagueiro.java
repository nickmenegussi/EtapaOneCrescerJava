package jogador;
import ApetiteJogador.ApetiteJogador;

import java.math.BigDecimal;

public class Zagueiro extends Jogador {
    public Zagueiro(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetite, BigDecimal precoDeMercado) {
        super(nomeJogador, idadeJogador, clubeAtual, reputacaoHistorica, apetite, precoDeMercado);
    }

    @Override
    public BigDecimal valorDeCompra() {
        BigDecimal valorBase = super.valorDeCompra();

        if (idadeJogador > 30) {
            BigDecimal desconto = valorBase.multiply(BigDecimal.valueOf(0.20));
            return valorBase.subtract(desconto);
        }

        return valorBase;
    }
}
