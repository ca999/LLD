package Chess;

public class Player {
    private String name;
    private final Color color;

    Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }


}
