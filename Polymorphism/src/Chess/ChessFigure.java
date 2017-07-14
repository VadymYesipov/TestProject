package Chess;

/**
 * Created by User on 014 14.07.17.
 */
public abstract class ChessFigure {

    private Position position;

    void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public abstract boolean move(Position position);
}
