package jogador;

import ApetiteJogador.ApetiteJogador;
import Clube.Clube;

import java.math.BigDecimal;

public class MeioCampo extends  Jogador{
    public MeioCampo(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetiteFinanceiro, BigDecimal precoDeMercado) {
        super(nomeJogador, idadeJogador, clubeAtual, reputacaoHistorica, apetiteFinanceiro, precoDeMercado);
    }

    @Override
    public BigDecimal valorDeCompra() {
        BigDecimal valorBase = super.valorDeCompra();

        if (idadeJogador > 30) {
            BigDecimal desconto = valorBase.multiply(BigDecimal.valueOf(0.30));
            return valorBase.subtract(desconto);
        }

        return valorBase;
    }

    @Override
    public boolean temInteresseEmClube(Clube clube) {
        return clube.getReputacaoClube() <= (this.reputacaoHistorica - 2);
    }
}
