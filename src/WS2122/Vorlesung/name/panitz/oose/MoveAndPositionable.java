public interface MoveAndPositionable extends Moveable, Positionable {
	@Override
	default void moveBy(int dx, int dy) {
		setPos(getX()+dx, getY()+dy);
	}
}
