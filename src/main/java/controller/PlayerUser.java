package controller;

public class PlayerUser {

    int x;
    int y;

    boolean status = true;

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
        return "User position: [" + x + "]["+ y +"]";
    }


}