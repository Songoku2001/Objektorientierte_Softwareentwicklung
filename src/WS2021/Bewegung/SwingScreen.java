package WS2021.Bewegung;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.Graphics;

public class SwingScreen extends JPanel {
  GeoGame game;

  public SwingScreen(GeoGame game) {
    this.game = game;
    
    timer.start();
  }

  @Override 
  public Dimension getPreferredSize(){
    return new Dimension(game.getWidth(),game.getHeight());
  } 
  @Override 
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    for (var geo:game.getGeos()) geo.paintMeTo(g);
  } 

  Timer timer = new Timer(30,ev->{
    game.move();
    game.collisionCheck();
    repaint();
  });
}