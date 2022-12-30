package WS2021.Vererbung_equals;

public class Star extends PolygonObject {
  int beams;
  double innerRadius;
  
  public Star(int beams,double innerRadius, Vertex corner,
      double width, Vertex velocity) {
    super(corner, width, width, velocity);
    this.beams = beams;
    this.innerRadius = innerRadius;
    initPolygon();
    // korrekte Initalisierung des Super-Objekts
    // Initialisierung der Felder dieser Klasse
    // Aufruf von initPolygon
  }
  @Override
  public String toString() {
    return "new Star("+beams+", "+innerRadius+", new Vertex"
        +corner+", "+width+", new Vertex"+velocity+")";
  }

  @Override
  void initPolygon() {
    double grad = 360/beams;
    for( double i = beams; i>0 ;i--){

      p.add(width/2 * Math.cos(Math.toRadians(grad*i))+ width/2, width/2 * Math.sin(Math.toRadians(grad*i))+ height/2);
      p.add(innerRadius * Math.cos(Math.toRadians(grad*i-grad/2))+ width/2, innerRadius * Math.sin(Math.toRadians(grad*i-grad/2)) + height/2);
    }
  }
}