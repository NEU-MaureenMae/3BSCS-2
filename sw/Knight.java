package sw;

public class Knight implements Type {
    public String attack() {
        Sword sword = new Sword();
        return "Knight attacks:\n" + sword.Attacks();
    }

    public String defend(){
        Shield shield = new Shield();
        MagicBarrier magicBarrier = new MagicBarrier();
        Dodge dodge = new Dodge();

        return "Knight defends:\n" + shield.Defends() + "\n" +
                magicBarrier.Defends() + "\n" + dodge.Defends();

    }

}
