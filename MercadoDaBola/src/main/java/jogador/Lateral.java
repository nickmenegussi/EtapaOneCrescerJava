package jogador;
import ApetiteJogador.ApetiteJogador;

import java.math.BigDecimal;

public class Lateral extends  Jogador{
    protected int cruzamnentosCerteirosNoAno;

    public Lateral(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetite, BigDecimal precoDeMercado, int cruzamnentosCerteirosNoAno) {
        super(nomeJogador, idadeJogador, clubeAtual, reputacaoHistorica, apetite, precoDeMercado);
        this.cruzamnentosCerteirosNoAno = cruzamnentosCerteirosNoAno;
    }

    @Override
    public BigDecimal valorDeCompra() {
        BigDecimal calculoBase = super.valorDeCompra();
        BigDecimal acrescimo = calculoBase.multiply(BigDecimal.valueOf(0.02)) // 2% por cruzamento
                .multiply(BigDecimal.valueOf(cruzamnentosCerteirosNoAno));
        BigDecimal valorComAcrescimo = calculoBase.add(acrescimo);

        if (idadeJogador > 28) {
            BigDecimal desconto = valorComAcrescimo.multiply(BigDecimal.valueOf(0.30)); // 30%
            return valorComAcrescimo.subtract(desconto);
        }

        return valorComAcrescimo;
    }
}
