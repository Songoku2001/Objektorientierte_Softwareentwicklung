package WS2021.Bewegung;

import java.util.List;
import java.util.ArrayList;

public class SimpleGeoGame implements GeoGame {
  List<GeometricObject> geos = new ArrayList<>();
  int width;
  int height;
  
  public SimpleGeoGame(int width,int height, GeometricObject...  geos) {
    for (var geo:geos) this.geos.add(geo);
    this.width = width;
    this.height = height;
  }
  
  public SimpleGeoGame(GeometricObject... geometricObjects) {
    this(800,600,geometricObjects);
  }

  @Override
  public List<GeometricObject> getGeos() {
    return geos;
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }

  @Override
  public void move() {
    for (GeometricObject hallo : geos) {
      hallo.move();
    }
    }
    /*for(int i=0; i<geos.size();i++){      i<=geos.size()-1
      geos.get(i).move();                 So kriegt man das Objekt an der Stelle i einer Liste
    }*/


  @Override
  public void collisionCheck() {

    for (GeometricObject g : geos) {

      if (g.corner.x + g.width >= width) {
        g.velocity.x = -g.velocity.x;
      }
      if (g.corner.x <= 0) {
        g.velocity.x = -g.velocity.x;
      }
      if (g.corner.y + g.height >= height) {
        g.velocity.y = -g.velocity.y;
      }
      if (g.corner.y <= 0) {
        g.velocity.y = -g.velocity.y;
      }
    }
/*
    for (int i = 0; i < geos.size(); i++) {
      if (geos.get(i).corner.x + geos.get(i).width >= getWidth()) {
        geos.get(i).velocity.x = -geos.get(i).velocity.x;
      }
      if (geos.get(i).corner.x <= 0) {
        geos.get(i).velocity.x = -geos.get(i).velocity.x;
      }
      if (geos.get(i).corner.y + geos.get(i).height >= getHeight())
        geos.get(i).velocity.y = -geos.get(i).velocity.y;

      if (geos.get(i).corner.y <= 0) {
        geos.get(i).velocity.y = -geos.get(i).velocity.y;
      }
    }*/

    for(int i=0; i < geos.size(); i++) {
      for (int j = i + 1; j < geos.size(); j++) {
        if(geos.get(i).touches(geos.get(j))){

          Vertex speicher = geos.get(i).velocity;
          geos.get(i).velocity = geos.get(j).velocity;
          geos.get(j).velocity = speicher;
        }
      }
    }
  }
}