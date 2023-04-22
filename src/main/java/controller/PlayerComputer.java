package controller;

public class PlayerComputer {

    String name;
    int x;
    int y;

    public PlayerComputer(String name){
        this.name = name;
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

    @Override
    public String toString() {
        return
                name +" position: [" + x + "]["+ y +"]";
    }


//    @Override
//    public String toString() {
//        return "PlayerComputer{" +
//                "name='" + name + '\'' +
//                ", x=" + x +
//                ", y=" + y +
//                '}';
    }



