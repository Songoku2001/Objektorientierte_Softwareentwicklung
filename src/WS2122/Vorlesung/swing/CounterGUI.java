import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterGUI extends JPanel implements ActionListener {
  JButton b1 = new JButton("reset");
  JButton b2 = new JButton("add 1");
  JLabel l = new JLabel("0");
  Counter counter;



  private class MyListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      counter.inc();
      l.setText("" + counter.get());
    }
  }

  public CounterGUI(Counter counter) {
    super();
    this.counter = counter;
    this.add(l);
    this.add(b1);
    this.add(b2);
//1. Schreibe externe Klasse, die ActionListener implementiert
//und this als Parameter im Konstruktor bekommt
    // b2.addActionListener(new MyListener(this));

//2. Schreibe innere Klasse, die ActionListener implementiert.
    // b2.addActionListener(new MyListener2());

//3. erzeuge Objekt, das ActionListener implementiert als Objekt einer anonymen Klasse.
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        counter.inc();
        l.setText("" + counter.get());
      }
    });

//4. implementiere ActionListener durch einen Lambdaausdruck
    /*
     * b1.addActionListener((ActionEvent e) -> { counter.reset(); l.setText(""+ counter.get()); });
     */
    // noch kÃ¼rzer: du kannst sogar Typinfo weglassen
    b1.addActionListener(e -> {counter.reset();l.setText("" +  counter.get());});

    //5. Antipattern, nicht objektorientiert
    //Die Ã¤uÃŸere Klasse implementiert ActionListener
    b1.addActionListener(this);
    b2.addActionListener(this);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource()==b1) counter.reset();
    else if (e.getSource()==b2)  counter.inc();

    l.setText("" +  counter.get());
  }

  public static void main(String[] args) {
    var f = new JFrame("Hier kÃ¶nnte Ihre Werbung stehen!");
    f.add(new CounterGUI(new Counter()));
    f.pack();
    f.setVisible(true);
  }

}
