package moveController;

public class MoveLeft extends Movement {

    @Override
    public int move(int x) {
        x-=1;
        return x;
    }
}
