package WS2021.Vererbung_equals;

public class IsoscelesTriangle extends PolygonObject {
  double legLength;

  public IsoscelesTriangle(Vertex corner, double baseLength,
      double legLength, Vertex velocity) {
      super(corner, baseLength,Math.sqrt(Math.pow(legLength, 2) - Math.pow(baseLength / 2, 2)),velocity);
      this.legLength = legLength;
      initPolygon();
      // TODO super-Aufruf, Länge der Schenkel initialisieren
      // und initPolygon() Aufrufen 


 }

  @Override
  void initPolygon() {
      p.add(width/2,0);
      p.add(width, height);
      p.add(0, height);
  }
  @Override
  public double size(){
      return 0.5 * width * height;
  }

  @Override
  public String toString() {
    return "new IsoscelesTriangle(new Vertex"
        +corner+", "+width+", "+legLength+", new Vertex"+velocity+")";
  }
}