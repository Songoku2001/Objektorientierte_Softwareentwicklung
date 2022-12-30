package WS2021.Vererbung_equals;

import java.awt.Graphics;

public class GeometricObject {
  Vertex corner;
  double width;
  double height;
  Vertex velocity;

  public GeometricObject(Vertex corner, double width, double height, Vertex velocity) {
    super();
    this.corner = corner;
    this.width = width;
    this.height = height;
    this.velocity = velocity;
  }

  double size(){return width*height;}
  
  boolean isLargerThan(GeometricObject that){
    return size()>that.size();
  }
  boolean isAbove(GeometricObject that){
    return corner.y+height<that.corner.y;
  }
  boolean isUnderneath(GeometricObject that){
    return that.isAbove(this);
  }
  boolean isLeftOf(GeometricObject that){
    return corner.x+width<that.corner.x;
  }
  boolean isRightOf(GeometricObject that){
    return that.isLeftOf(this);
  }
  boolean touches(GeometricObject that){
    return !(isLeftOf(that)
            || isRightOf(that)
            ||isAbove(that)
            ||isUnderneath(that));
  }
  void move(){
    corner.move(velocity);
  }

  public boolean equals(Object o){
    if(this == o)return true;
    if(o == null) return false;
    if (!o.getClass().equals(GeometricObject.class)) return false;
    GeometricObject that;   //that carsten
    that = (GeometricObject) o;

    if(!(Math.abs(width - that.width)<=1))return false;
    if(!(Math.abs(height - that.height)<=1) || (!corner.equals(that.corner)))return false;

    return true;
  }

  @Override
  public String toString() {
     return "Geo("+corner+","+width+","+height+","+velocity+")";
  }

  public void paintMeTo(Graphics gc) {    
    gc.fillRect((int)this.corner.x, (int) this.corner.y, (int) width, (int) height);
    //Paint the rectangle to the Graphics object
  }    
}