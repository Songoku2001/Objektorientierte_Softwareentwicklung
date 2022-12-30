class GeometricObject {
  Vertex corner;
  double width;
  double height;
  Vertex velocity;

  GeometricObject(Vertex corner, double width, double height, Vertex velocity) {
    this.corner = corner;
    this.width = width;
    this.height = height;
    this.velocity = velocity;
  }

  @Override
  public String toString() {
    return "Geo("+corner+","+width+","+height+","+velocity+")";
  }

  //Hier jetzt die Methoden implementieren!

  double size(){
    return height * width;
  }
  boolean isLargerThan(GeometricObject that){
    return this.size() > that.size();
  }
  boolean isAbove(GeometricObject that){ //that sollte über dem this liegen
    return that.corner.y > this.corner.y + this.height;
  }
  boolean isUnderneath(GeometricObject that){
    //return that.corner.y + that.height < this.corner.y;
    return that.isAbove(this);
  }
  boolean isLeftOf(GeometricObject that){
    return this.corner.x + this.width < that.corner.x;
  }
  boolean isRightOf(GeometricObject that){
    //return this.corner.x > that.corner.x + that.width;
    return that.isLeftOf(this);
  }
  boolean touches(GeometricObject that){
    return (!this.isAbove(that)
            && !this.isUnderneath(that)
            && !this.isLeftOf(that)
            && !this.isRightOf(that)
    );
  }

  public static void main(String[] args) {
    Vertex x = new Vertex(12, 12);
    GeometricObject meins = new GeometricObject(x, 12.0, 12.0, x);
    GeometricObject other = new GeometricObject(x, 13.0, 13.0, x);
  }

}