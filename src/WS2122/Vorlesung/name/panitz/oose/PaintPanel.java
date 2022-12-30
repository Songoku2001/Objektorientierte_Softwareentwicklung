import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PaintPanel extends JPanel{
	PaintableAndMoveable p;

	public PaintPanel(PaintableAndMoveable p) {
		super();
		this.p = p;
		new Timer(100, ev -> {p.move();repaint();}).start();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		p.paintMeTo(g);
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
	}
	void showInFrame() {
		var f = new JFrame();
		f.add(this);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		var ve = new Viereck(50, 30);
		ve.setPos(100, 120);
		new PaintPanel(ve).showInFrame();
	}
}
