import java.awt.Graphics;

public class Viereck implements Sizeable,  PaintableAndMoveable{
	int w;
	int h;
	int x;
	int y;
	
	public Viereck(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public void setSize(int width, int height) {
		w=width;
		h=height;
		
	}

	@Override
	public int getWidth() {
		return w;
	}

	@Override
	public int getHeight() {
		return h;
	}

	@Override
	public void setPos(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void paintMeTo(Graphics g) {
		g.fillRect(x, y, w, h);
		
	}
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void move() {
		moveBy(1, 1);
		
	}

}
