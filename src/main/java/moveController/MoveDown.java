package moveController;

public class MoveDown extends Movement {


    @Override
    public int move(int y) {
        y-=1;
        return y;
    }
}


