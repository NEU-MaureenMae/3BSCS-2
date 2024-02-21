package sw;

public class CharacterDemo {
    public static void main(String[] args) {

        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        System.out.println(knight.attack() + "\n");
        System.out.println(knight.defend() + "\n");
        System.out.println(wizard.attack() + "\n");
        System.out.println(wizard.defend() + "\n");
        System.out.println(archer.attack() + "\n");
        System.out.println(archer.defend() + "\n");

    }
}
