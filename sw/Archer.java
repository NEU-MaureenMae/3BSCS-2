package sw;

public class Archer implements Type{
    public String attack() {
        ShootArrow shootArrow = new ShootArrow();
        return "Archer ATTACKS:\n" + shootArrow.Attacks();
    }

    public String defend(){
        Dodge dodge = new Dodge();
        return "Archer DEFENDS:\n" + dodge.Defends();
    }
    
}
