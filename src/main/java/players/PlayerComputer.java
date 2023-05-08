package players;

public class PlayerComputer {

    String name;
    int x;
    int y;

    public PlayerComputer(String name){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return
                "Pozycja gracza "+ name +": [" + x + "]["+ y +"]";
    }

}



