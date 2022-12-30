package WS2021.Bewegung;

import java.awt.Graphics;
import java.awt.Color;

public abstract class PolygonObject extends GeometricObject {

  Polygon p = new Polygon();

  public PolygonObject(Vertex corner, double width, double height, Vertex velocity){
    super(corner, width, height, velocity);
  }

  abstract void initPolygon();

  @Override
  public void paintMeTo(Graphics g) {
    g.setColor(Color.RED);
    super.paintMeTo(g);

    int[] xs = p.getXs();
    int[] ys = p.getYs();
    for (int i = 0; i < p.size(); i++) {
      xs[i] = xs[i] + (int)Math.round(corner.x);
      ys[i] = ys[i] + (int)Math.round(corner.y);
    }
    g.setColor(Color.YELLOW);
    g.fillPolygon(xs, ys, p.size());
    g.setColor(Color.BLACK);
  }
}