package WS2021.Bewegung;

public class Play {
  public static void main(String[] args) {
    var game = new GeoApplication(new SimpleGeoGame(
        new GeometricObject(new Vertex(0, 0), 50, 50, new Vertex(5.0, 5.0)),  //,
              new GeometricObject(new Vertex(70, 0), 50, 50, new Vertex(4.2, 4.0)),
              new GeometricObject(new Vertex(0, 70), 50, 50, new Vertex(4.0, 4.0))
    //    new SnowFlake(4, new Vertex(160, 160), 150, new Vertex(1, 0.8)),
    //    new Star(8,25, new Vertex(280, 390), 150, new Vertex(0.5, 0.6)),
    //    new SquaresObject(2, new Vertex(480, 20), 200, new Vertex(1, 0.3)),
    //    new IsoscelesTriangle(new Vertex(40,40), 80, 111, new Vertex(0.4,1.7))
        ));
    game.setVisible(true);
  }
}