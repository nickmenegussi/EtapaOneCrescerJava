package jogador;
import ApetiteJogador.ApetiteJogador;
import Clube.Clube;

import java.math.BigDecimal;

public class Atacante extends Jogador{
    protected static int golsFeitosNoAno;

    public Atacante(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetite, BigDecimal precoDeMercado, int golsFeitosNoAno) {
        super(nomeJogador, idadeJogador, clubeAtual, reputacaoHistorica, apetite, precoDeMercado);
        this.golsFeitosNoAno = golsFeitosNoAno;
    }

    @Override
    public BigDecimal valorDeCompra() {
        BigDecimal valorBase = super.valorDeCompra(); // valor do jogador com apetite já aplicado

        BigDecimal acrescimo = valorBase.multiply(BigDecimal.valueOf(0.10)); // 10% de acréscimo
        BigDecimal valorComAcrescimo = valorBase.add(acrescimo);

        if (idadeJogador > 30) {
            BigDecimal desconto = valorBase.multiply(BigDecimal.valueOf(0.25)); // 25% de desconto sobre valor base
            return valorComAcrescimo.subtract(desconto);
        }

        return valorComAcrescimo;
    }

    // regra especial para atacante
    public boolean temInteresseEmClube(Clube clube) {
        return clube.getReputacaoClube() > this.reputacaoHistorica;
    }
}
