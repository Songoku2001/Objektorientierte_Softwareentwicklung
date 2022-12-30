package WS2021.Vererbung_equals;

/*
public class Play {
  public static void main(String[] args) {
    var game = new GeoWindow(new GeometricObject(new Vertex(0, 0), 10, 10, new Vertex(0.2, 0.7)),
      new GeometricObject(new Vertex(200, 150), 40, 80, new Vertex(0.1, 0.2)),
            new IsoscelesTriangle(new Vertex(20, 20),100, 75, new Vertex(0,0)));
    new Star(12,50, new Vertex(280, 90), 150, new Vertex(0.01, 0.0));

    game.setVisible(true);
  }*/
public class Play {
  public static void main(String[] args) {
    var s = new Star(12, 50, new Vertex(280, 90), 150, new Vertex(0.01, 0.0));
    var p = new GeometricObject(new Vertex(37.500000000000014 + 280, 139.9519052838329 + 90), 1, 1, new Vertex(0, 0));
    var game = new GeoWindow(s, p);

    game.setVisible(true);
  }
}
