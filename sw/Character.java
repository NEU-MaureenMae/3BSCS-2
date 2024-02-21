package sw;

public class Character {
    private Type type;

    public Character(Type type) {
        this.type = type;
    }

    public String attack(){
        return type.attack();
    }

    public String defend(){
        return type.defend();
    }
    
}
