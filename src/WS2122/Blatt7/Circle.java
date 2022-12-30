class Circle extends Ellipse {

  //hier Konstruktoren und Methoden schreiben
  Circle(){
    super(new Vertex(0,0), 100, 100, new Vertex(0,0));
  }
  Circle(Vertex corner){
    super(corner, 100, 100, new Vertex(0,0));
  }
  Circle(Vertex corner, double diameter){
    super(corner, diameter, diameter, new Vertex(0,0));
  }
  Circle(Vertex corner, double diameter, Vertex velocity){
    super(corner, diameter, diameter, velocity);
  }

  @Override
  public String toString(){
    return "Circle " + super.toString();
  }

}