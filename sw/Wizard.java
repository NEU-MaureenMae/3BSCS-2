package sw;

public class Wizard implements Type{
    public String attack() {
        Spell spell = new Spell();
        return "Wizard ATTACKS:\n" + spell.Attacks();
    }

    public String defend(){
        MagicBarrier magicBarrier = new MagicBarrier();
        return "Wizard DEFENDS:\n" + magicBarrier.Defends();
    }
    
}
