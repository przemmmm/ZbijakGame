package moveController;

public class MoveRight extends Movement{

    @Override
    public int move(int x) {
        x+=1;
        return x;
    }
}
