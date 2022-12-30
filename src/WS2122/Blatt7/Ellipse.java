class Ellipse extends GeometricObject {

  //hier Konstruktoren und Methoden schreiben
  Ellipse(){
    super(new Vertex(0, 0),100, 100, new Vertex(0, 0));
  }
  Ellipse(Vertex corner){
    super(corner, 100, 100, new Vertex(0, 0));
  }
  Ellipse(Vertex corner, double width, double height){
    super(corner, width, height, new Vertex(0, 0));
  }
  Ellipse(Vertex corner, double width, double height, Vertex velocity){
    super(corner, width, height, velocity);
  }

  @Override
  public String toString(){
    return  "Ellipse:" + super.toString();
  }

  @Override
  public double size(){
    //return (this.width/2) * (this.height/2) * Math.PI;
    return (super.size()/4) * Math.PI;
  }

}