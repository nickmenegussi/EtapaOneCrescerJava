public class Ninja {
    private int chakraNinja = 100 ;
    private String nomeNinja;
    private Jutsu jutsuPrincipal;

    // 3. Funções e métodos.
    public Ninja(String nomeNinja, Jutsu jutsuPrincipal){
        this.nomeNinja = nomeNinja;
        this.jutsuPrincipal = jutsuPrincipal;
    }

    public void atacar(Ninja ninjaOponente){
        this.chakraNinja -= this.jutsuPrincipal.getQuantidadechakraConsumidoPeloJutsu();
        ninjaOponente.receberGolpe(this.jutsuPrincipal.getQuantidadeChakraRemovidaPeloDano());
    }

    public void receberGolpe(int danoDoGolpeRecebido){
        this.chakraNinja -= danoDoGolpeRecebido;
    }

    public int getChakraNinja(){
        return this.chakraNinja;
    }

    public String getNomeNinja() {
        return nomeNinja;
    }
}
