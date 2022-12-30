package WS2021.Vererbung_equals;

import javax.swing.JFrame;

public class GeoWindow extends JFrame {  
  public GeoWindow(GeometricObject... geos){
    super("Hier könnte Ihre Werbung stehen");
    add(new SwingScreen(geos));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }
}