public class Jutsu {
    // 1. O problema? Modele uma classe Jutsu que possui como atributos a quantidade de chakra que consome quando utilizado e o dano (quantidade de chakra que abate do oponente).
    // 2. Os dados? (chakra consumido pelo Jutsu max = 5). dano no maximo 10.
    private int quantidadechakraConsumidoPeloJutsu ;
    private int quantidadeChakraRemovidaPeloDano;

    // 3. As funções.
    public Jutsu(int quantidadechakraConsumidoPeloJutsu, int quantidadeChakraRemovidaPeloDano){
        if(quantidadechakraConsumidoPeloJutsu >= 0 && quantidadechakraConsumidoPeloJutsu <= 5 && quantidadeChakraRemovidaPeloDano >= 0 && quantidadeChakraRemovidaPeloDano <= 10){
            this.quantidadechakraConsumidoPeloJutsu = quantidadechakraConsumidoPeloJutsu;
            this.quantidadeChakraRemovidaPeloDano = quantidadeChakraRemovidaPeloDano;
        } else {
            this.quantidadechakraConsumidoPeloJutsu = 0;
            this.quantidadeChakraRemovidaPeloDano = 0;
        }
    }

    public int getQuantidadechakraConsumidoPeloJutsu(){
        return quantidadechakraConsumidoPeloJutsu;
    }

    public int getQuantidadeChakraRemovidaPeloDano() {
        return quantidadeChakraRemovidaPeloDano;
    }
}
