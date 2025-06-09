package Negociacao;

import jogador.Jogador;
import Clube.Clube;

import java.math.BigDecimal;

public class Negociacao {
    // RN20: na negociação deve ser verificado se o jogador possui interesse em jogar pelo clube ofertante.

    // RN21: na negociação deve ser verificado se o clube tem como pagar o valor de compra do jogador.
    // RN22: a transferencia de clube do jogador deve ocorrer na Negociacao, desde que as RN20 e RN21 sejam positivas.
    // RN23: se efetuada a trasnferência, o saldo disponível em caixa do clube deve ser atualizado.

    public boolean negociar(Clube clubeInteressado, Jogador jogadorDeInteresse){
        // deve retornar true quando foi possivel realizar a transferencia e false quando nao.
        BigDecimal valorCompra = jogadorDeInteresse.valorDeCompra();

        if(jogadorDeInteresse.temInteresseEmClube(clubeInteressado) && clubeInteressado.getSaldoDisponveilEmCaixa().compareTo(valorCompra) >= 0){
            jogadorDeInteresse.setClubeAtual(clubeInteressado.getNome());
            clubeInteressado.setSaldoDisponveilEmCaixa(clubeInteressado.getSaldoDisponveilEmCaixa().subtract(valorCompra));
            return true;
        } else {
            return false;
        }


    }

}
