package WS2021.Vererbung_equals;

import javax.swing.*;
import java.awt.*;

public class SwingScreen extends JPanel {
  GeometricObject[] geos ;

  public SwingScreen(GeometricObject... geos) {
    this.geos = geos;
  }

  @Override 
  public Dimension getPreferredSize(){
    return new Dimension(800,600);
  } 
  @Override 
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    for (var geo:geos) geo.paintMeTo(g);
  } 
}