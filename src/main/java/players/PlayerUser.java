package players;

public class PlayerUser {

    int x;
    int y;

    public PlayerUser(){};
    public PlayerUser(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean status = true; //to verify if user is matted or not. True - not matted, false - matted.
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {return y;}
    public void setY(int y) {
        this.y = y;
    }
    public boolean getStatus() {return status;}
    public void setStatus(boolean status) { this.status = status;}
    @Override
    public String toString() {
        return "[" + x + "]["+ y +"]";
    }


}