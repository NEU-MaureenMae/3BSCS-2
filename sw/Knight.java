package sw;

public class Knight implements Type {
    public String attack() {
        SwingSword swingSword = new SwingSword();
        return "Knight attacks:\n" + swingSword.Attacks();
    }

    public String defend(){
        Shield shield = new Shield();
        MagicBarrier magicBarrier = new MagicBarrier();
        Dodge dodge = new Dodge();

        return "Knight defends:\n" + shield.Defends() + "\n" +
                magicBarrier.Defends() + "\n" + dodge.Defends();

    }

}
