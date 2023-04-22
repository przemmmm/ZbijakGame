package controller;

public class MoveUp extends Movement {


    @Override
    public int move(int y) {
        y+=1;
        return y;
    }
}
