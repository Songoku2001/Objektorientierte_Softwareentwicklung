package WS2021.Vererbung_equals;

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

  @Override
  public boolean equals(Object o) {
    if(this == o)return true;
    if (o == null) return false;
    if (!o.getClass().equals(Vertex.class)) return false;

    Vertex that = (Vertex) o;
    if (!(Math.abs(this.x - that.x) <= 1)) return false;
    if (!(Math.abs(this.y - ((Vertex) o).y) <= 1)) return false;
    return true;
  }
}