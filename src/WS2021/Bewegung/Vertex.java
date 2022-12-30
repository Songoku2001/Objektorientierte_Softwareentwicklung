package WS2021.Bewegung;

public class Vertex {
  double x;
  double y;
  public Vertex(double x, double y) {
    super();
    this.x = x;
    this.y = y;
  }

  void move(Vertex v){
    x += v.x;
    y += v.y;
  }
  void moveTo(Vertex v){
    x = v.x;
    y = v.y;
  }
  @Override
  public String toString() {
    return "("+x+", "+y+")";
  }
}