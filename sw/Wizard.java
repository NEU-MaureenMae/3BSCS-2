package sw;

public class Wizard implements Type{
    public String attack() {
        CastSpell castSpell = new CastSpell();
        return "Wizard ATTACKS:\n" + castSpell.Attacks();
    }

    public String defend(){
        MagicBarrier magicBarrier = new MagicBarrier();
        return "Wizard DEFENDS:\n" + magicBarrier.Defends();
    }
    
}
