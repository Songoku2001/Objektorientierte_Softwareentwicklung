import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
  CounterGUI myPanel;
  public MyListener(CounterGUI myPanel) {
    this.myPanel = myPanel;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    myPanel.counter.inc();
    myPanel.l.setText(""+myPanel.counter.get());

  }

}
