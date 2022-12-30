public class Vertex {
  double x;
  double y;

  public Vertex(double x, double y) {
    super();
    this.x = x;
    this.y = y;
  }
  @Override
  public String toString() {
    return "("+x+","+y+")";
  }

  //TODO equals überschreiben
  @Override
  public boolean equals(Object obj){
    //Von David
    //if(!obj.getClass().equals(Vertex.class)) return false;

    if (obj instanceof Vertex that){
      return (Math.abs(this.x - that.x) <= 1) && (Math.abs(this.y - that.y) <= 1);
    }
    return false;
  }


  void move(Vertex v){
    x += v.x;
    y += v.y;
  }
  void moveTo(Vertex v){
    x = v.x;
    y = v.y;
  }

}