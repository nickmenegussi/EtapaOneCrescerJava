public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundaNinja){
        primeiroNinja.atacar(segundaNinja);
        primeiroNinja.atacar(segundaNinja);
        primeiroNinja.atacar(segundaNinja);
        segundaNinja.atacar(primeiroNinja);
        segundaNinja.atacar(primeiroNinja);
        segundaNinja.atacar(primeiroNinja);

        int chakraPrimeiroNinja = primeiroNinja.getChakraNinja();
        int chakraSegundoNinja = segundaNinja.getChakraNinja();

        if(primeiroNinja.getNomeNinja().equals("Itachi")){
            return primeiroNinja;
        } else if (segundaNinja.getNomeNinja().equals("Itachi")){
            return segundaNinja;
        } else if(chakraPrimeiroNinja > chakraSegundoNinja){
            return primeiroNinja;
        } else if (chakraSegundoNinja > chakraPrimeiroNinja){
            return segundaNinja;
        } else {
            return primeiroNinja;
        }
    }
}
