package jogador;

import ApetiteJogador.ApetiteJogador;
import Clube.Clube;

import java.math.BigDecimal;

public class Jogador {
    protected String nomeJogador;
    protected  int idadeJogador;
    protected String clubeAtual;
    protected ApetiteJogador apetiteJogador;
    protected int reputacaoHistorica;
    protected BigDecimal precoDeMercado;

    public Jogador(String nomeJogador, int idadeJogador, String clubeAtual, int reputacaoHistorica, ApetiteJogador apetite , BigDecimal precoDeMercado){
        this.nomeJogador = nomeJogador;
        this.idadeJogador = idadeJogador;
        this.clubeAtual = clubeAtual;
        this.apetiteJogador = apetite;
        this.reputacaoHistorica = reputacaoHistorica;
        this.precoDeMercado = precoDeMercado;
    }

    public int getIdadeJogador() {
        return idadeJogador;
    }

    public String getClubeAtual(String clubeAtual) {
        if(clubeAtual != null && !clubeAtual.isEmpty()){
            return clubeAtual;
        } else {
            return "Sem clube";
        }
    }

    public String descreverReputacaoHistorica(){
        if(reputacaoHistorica >= 0 && reputacaoHistorica <= 10){
            if(reputacaoHistorica <= 5){
                return "baixa reputação";
            } else {
                return "alta reputação";
            }
        } else {
            return "reputação inválida";
        }
    }

    public BigDecimal getPrecoDeMercado() {
        return precoDeMercado;
    }

    public ApetiteJogador getApetiteJogador() {
        return apetiteJogador;
    }

    public int getReputacaoHistorica(){
        return reputacaoHistorica;
    }

    public BigDecimal valorDeCompra(){
        double percentual = apetiteJogador.getPercentualAcrescimo();
        BigDecimal acrescimo = precoDeMercado.multiply(BigDecimal.valueOf(percentual));

        return precoDeMercado.add(acrescimo);
    }

    // é regra geral para qualquer jogador
    public boolean temInteresseEmClube(Clube clube) {
        return clube.getReputacaoClube() >= 1;
    }

    public void transferirPara(Clube novoClube){
        if(temInteresseEmClube(novoClube)){
            this.clubeAtual = novoClube.getNome();
        }
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }
}
