package sw;

public class Archer implements Type{
    public String attack() {
        Arrow arrow = new Arrow();
        return "Archer ATTACKS:\n" + arrow.Attacks();
    }

    public String defend(){
        Dodge dodge = new Dodge();
        return "Archer DEFENDS:\n" + dodge.Defends();
    }
    
}
