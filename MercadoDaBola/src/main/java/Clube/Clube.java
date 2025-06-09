package Clube;

import java.math.BigDecimal;

public class Clube {
    protected String nome;
    protected int reputacaoClube;
    protected BigDecimal saldoDisponveilEmCaixa;

    public Clube(String nome, int reputacaoClube, BigDecimal saldoDisponveilEmCaixa) {
        this.nome = nome;
        this.reputacaoClube = reputacaoClube;
        this.saldoDisponveilEmCaixa = saldoDisponveilEmCaixa;
    }

    public String getNome() {
        return nome;
    }

    public int getReputacaoClube() {
        return reputacaoClube;
    }

    public BigDecimal getSaldoDisponveilEmCaixa() {
        return saldoDisponveilEmCaixa;
    }

    public void setSaldoDisponveilEmCaixa(BigDecimal saldoDisponveilEmCaixa) {
        this.saldoDisponveilEmCaixa = saldoDisponveilEmCaixa;
    }
}
