package Chess;


public class Elephant extends ChessFigure {

    public Elephant(int x, int y) {
        setPosition(new Position(x, y));
    }

    @Override
    public boolean move(Position position) {
        if (position.getX() == position.getY() || position.getX() >= 7 ||
                position.getX() <= 0 || position.getY() >= 7 || position.getY() <= 0) {
            if (position.getX() > getPosition().getX() && getPosition().getY() > position.getY() //вправо вниз
                    || getPosition().getX() > position.getX() && position.getY() > getPosition().getY()) { //налево вверх
                if (position.getX() + position.getY() == getPosition().getY() + getPosition().getX()) {
                    setPosition(position);
                    return true;
                }
            } else if (getPosition().getX() > position.getX() && getPosition().getY() > position.getY() //налево вниз
                    || position.getX() > getPosition().getX() && position.getY() > getPosition().getY()) { //направо вверх
                if (getPosition().getX() > position.getX() && getPosition().getY() > position.getY()) {
                    if (getPosition().getX() - position.getX() == getPosition().getY() - position.getY()) {
                        setPosition(position);
                        return true;
                    }
                } else if (position.getX() > getPosition().getX() && position.getY() > getPosition().getY()) {
                    if (position.getX() - getPosition().getX() == position.getY() - getPosition().getY()) {
                        setPosition(position);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
