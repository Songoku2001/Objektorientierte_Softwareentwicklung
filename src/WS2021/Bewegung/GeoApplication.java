package WS2021.Bewegung;

import javax.swing.JFrame;

public class GeoApplication extends JFrame {  
  public GeoApplication(GeoGame game){
    super("Hier könnte Ihre Werbung stehen");
    add(new SwingScreen(game));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
  }
}