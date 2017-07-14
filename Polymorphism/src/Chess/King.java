package Chess;


public class King extends ChessFigure {

    public King(int x, int y) {
        setPosition(new Position(x, y));
    }

    @Override
    public boolean move(Position position) {
        if (position.getX() == getPosition().getX() && position.getY() != getPosition().getY()) {
            if (getPosition().getY() == 0 && position.getY() - getPosition().getY() == 1) {
                setPosition(position);
                return true;
            } else if (getPosition().getY() == 7 && getPosition().getY() - position.getX() == 1) {
                setPosition(position);
                return true;
            } else if (getPosition().getY() != 0 && getPosition().getY() != 7) {
                int comparison = position.getY() - getPosition().getY();
                if (comparison == 1 || comparison == -1) {
                    setPosition(position);
                    return true;
                }
            }
            return false;
        } else if (position.getY() == getPosition().getY() && position.getX() != getPosition().getX()) {
            if (getPosition().getX() == 0 && position.getX() - getPosition().getX() == 1) {
                setPosition(position);
                return true;
            } else if (getPosition().getX() == 7 && getPosition().getX() - position.getX() == 1) {
                setPosition(position);
                return true;
            } else if (getPosition().getX() != 0 && getPosition().getX() != 7) {
                int comparison = position.getX() - getPosition().getX();
                if (comparison == 1 || comparison == -1) {
                    setPosition(position);
                    return true;
                }
            }
            return false;
        } else {
            int comparisonX = position.getX() - getPosition().getX();
            int comparisonY = position.getY() - getPosition().getY();
            if ((comparisonX == -1 || comparisonX == 1) && (comparisonY == -1 || comparisonY == 1)) {
                setPosition(position);
                return true;
            }
            return false;
        }
    }
}
